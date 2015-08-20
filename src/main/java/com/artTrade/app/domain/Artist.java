package com.artTrade.app.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "ARTIST")
@Entity
public class Artist {
	@Id
	@GeneratedValue
	@Column(name = "ARTIST_ID")
	private long id;
	private String name;
	private int age;
	private String gender;

	@ManyToMany
	public List<Events> events = new ArrayList<Events>();

	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "ARTIST_PORTFOLIO", joinColumns = { @JoinColumn(name = "ARTIST_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "id") })
	public List<ArtistPortfolio> portfolio;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Events> getEvents() {
		return events;
	}

	public void setEvents(List<Events> events) {
		this.events = events;
	}

	public List<ArtistPortfolio> getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(List<ArtistPortfolio> portfolio) {
		this.portfolio = portfolio;
	}

}
