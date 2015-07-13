package com.artTrade.app.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.artTrade.app.domain.EventOrg;

@Repository
public class EventOrgRepositoryImpl implements EventOrgRepository{
	private static final Logger logger = LoggerFactory.getLogger(EventOrgRepositoryImpl.class);
	
	@Autowired
	private SessionFactory sf;
	
	@Override
	public void addEventOrg(EventOrg eo) {
		// TODO Auto-generated method stub
		Session session = sf.getCurrentSession();
		session.persist(eo);
		logger.info("Event Organiser saved successfully, Event Organiser Details="+eo);
	}

	@Override
	public void updateEventOrg(EventOrg eo) {
		// TODO Auto-generated method stub
		Session session = sf.getCurrentSession();
		session.update(eo);
		logger.info("Event Organiser updated successfully, Event Organiser Details="+eo);
		
	}

	@Override
	public List<EventOrg> listEventOrg() {
		// TODO Auto-generated method stub
		Session session = sf.getCurrentSession();
		List<EventOrg> eventOrgList = session.createQuery("from EventOrg").list();
        for(EventOrg eo : eventOrgList){
            logger.info("EventOrg List::"+eo);
        }
        return eventOrgList;
	}

	@Override
	public EventOrg getEventOrgById(int id) {
		// TODO Auto-generated method stub
		Session session = sf.getCurrentSession();
		EventOrg eo = (EventOrg) session.load(EventOrg.class, new Integer(id));
		logger.info("Event Organiser loaded successfully, Event Org details="+eo);
		return eo;
	}

	@Override
	public void removeEventOrg(int id) {
		// TODO Auto-generated method stub
		Session session = sf.getCurrentSession();
		EventOrg eo = (EventOrg) session.load(EventOrg.class, new Integer(id));
        if(null != eo){
            session.delete(eo);
            logger.info("Event Organiser deleted successfully, Event Org details="+eo);
        }
		
	}

	@Override
	public List<EventOrg> getEventOrgByEmail(String email) {
		Session session = sf.getCurrentSession();
		logger.info("Get Event Organiser By Email "+email);
		
		Query q = session.createQuery("FROM EventOrg e WHERE e.email = :email");
		q.setString("email", email);
		List<EventOrg> eoList = q.list();
		logger.info("Retrieved Event Organiser = "+eoList);
		return eoList;
	}

}
