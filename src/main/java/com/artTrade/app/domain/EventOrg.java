package com.artTrade.app.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.criteria.Fetch;

@Table(name="EVENT_ORG")
@Entity
public class EventOrg {
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	//public List<Category> categories;
	
	@OneToMany(mappedBy = "organiser", fetch = FetchType.LAZY)
	public List<Events> events;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
