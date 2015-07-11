package com.artTrade.app.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Table(name="EVENTS")
@Entity
public class Events {
	@Id
	@GeneratedValue
	private int id;
	
	private String title;
	private Date sdate;
	private Date edate;
	
	@ManyToOne
	private EventOrg organiser;
	
	@ManyToMany(mappedBy = "events", fetch = FetchType.LAZY)
	public List<Artist> artists;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getSdate() {
		return sdate;
	}
	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}
	public Date getEdate() {
		return edate;
	}
	public void setEdate(Date edate) {
		this.edate = edate;
	}
	public EventOrg getOrganiser() {
		return organiser;
	}
	public void setOrganiser(EventOrg organiser) {
		this.organiser = organiser;
	}

}
