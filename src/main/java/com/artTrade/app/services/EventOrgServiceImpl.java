package com.artTrade.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.artTrade.app.domain.EventOrg;
import com.artTrade.app.repository.EventOrgRepository;

@Service
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

	@Override
	@Transactional
	public List<EventOrg> getEventOrgByEmail(String email) {
		// TODO Auto-generated method stub
		return this.eventOrgRepo.getEventOrgByEmail(email);
		
	}
	
	@Override
	@Transactional
	public String encryptPassword(String password) {
		// TODO Auto-generated method stub
		BCryptPasswordEncoder b = new BCryptPasswordEncoder();
		//Check match
		//b.matches(rawPassword, encodedPassword)
		System.out.print(b.encode(password));
		return b.encode(password);
	}

}
