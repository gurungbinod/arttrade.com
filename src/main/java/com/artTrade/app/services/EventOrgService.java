package com.artTrade.app.services;

import java.util.List;

import com.artTrade.app.domain.EventOrg;

public interface EventOrgService {
	public void addEventOrg(EventOrg eo);
    public void updateEventOrg(EventOrg eo);
    public List<EventOrg> listEventOrg();
    public EventOrg getEventOrgById(int id);
    public void removeEventOrg(int id);
}
