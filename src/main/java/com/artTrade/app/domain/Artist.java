package com.artTrade.app.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name="ARTIST")
@Entity
public class Artist {
	@Id
	@GeneratedValue
	public long id;
	
	@ManyToMany
	public List<Events> events = new ArrayList<Events>();
}
