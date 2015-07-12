package com.artTrade.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.artTrade.app.domain.EventOrg;
import com.artTrade.app.repository.EventOrgRepository;

public class EventOrgServiceImpl implements EventOrgService {
	
	@Autowired
	EventOrgRepository eventOrgRepo;
	
	@Override
	@Transactional
	public void addEventOrg(EventOrg eo) {
		this.eventOrgRepo.addEventOrg(eo);
	}

	@Override
	@Transactional
	public void updateEventOrg(EventOrg eo) {
		this.eventOrgRepo.updateEventOrg(eo);
	}

	@Override
	@Transactional
	public List<EventOrg> listEventOrg() {
		// TODO Auto-generated method stub
		return this.eventOrgRepo.listEventOrg();
	}

	@Override
	@Transactional
	public EventOrg getEventOrgById(int id) {
		// TODO Auto-generated method stub
		return this.eventOrgRepo.getEventOrgById(id);
	}

	@Override
	@Transactional
	public void removeEventOrg(int id) {
		this.eventOrgRepo.removeEventOrg(id);
	}

}
