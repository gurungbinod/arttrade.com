package com.artTrade.app.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Table(name="ARTIST_PORTFOLIO")
@Entity
public class ArtistPortfolio {

	@Id
	@GeneratedValue
	public int id;
	public String videoLink;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVideoLink() {
		return videoLink;
	}

	public void setVideoLink(String videoLink) {
		this.videoLink = videoLink;
	}

}
