package com.GRP13.ETour.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tours")
public class Tours {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int tour_Id;
	@Column(name="tour_location")
	String tour_Location;
	@Column(name="tour_type")
	String tour_type;
	
	public Tours() {
		
	}
	
	
	public Tours(String tour_Location, String tour_type) {
		super();
		this.tour_Location = tour_Location;
		this.tour_type = tour_type;
	}
	
	
	public int gettour_Id() {
		return tour_Id;
	}
	public void settour_Id(int tour_Id) {
		this.tour_Id = tour_Id;
	}
	public String gettour_Location() {
		return tour_Location;
	}
	public void settour_Location(String tour_Location) {
		this.tour_Location = tour_Location;
	}
	public String gettour_type() {
		return tour_type;
	}
	public void settour_type(String tour_type) {
		this.tour_type = tour_type;
	}
	
}
