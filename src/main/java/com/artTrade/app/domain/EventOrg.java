package com.artTrade.app.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.criteria.Fetch;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Table(name = "EVENT_ORG")
@Entity
public class EventOrg {
	@Id
	@GeneratedValue
	private long id;

	@NotEmpty
	private String name;

	@NotEmpty
	private String address;

	@NotEmpty
	@Email
	private String email;

	@NotEmpty
	@Size(min = 6)
	private String password;

	@NotEmpty
	private String rePassword;

	// public List<Category> categories;

	public String getRePassword() {
		return rePassword;
	}

	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}

	@AssertTrue(message = "Passwords didn't match")
	private boolean passwordCheck() {
		return this.password.equals(this.rePassword);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToMany(mappedBy = "organiser", fetch = FetchType.LAZY)
	public List<Events> events;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Events> getEvents() {
		return events;
	}

	public void setEvents(List<Events> events) {
		this.events = events;
	}

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
	
	@Override
	public String toString() {
		String str = "Organizer Name = "+this.name+"<br>";
		str += "Organizer Email = "+this.email+"<br>";
		str += "Organizer Address = "+this.address+"<br>";
		return str;
	}
}
