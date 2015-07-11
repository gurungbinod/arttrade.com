package com.artTrade.app.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="CATEGORY")
@Entity
public class Category {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
}
