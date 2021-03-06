package com.GRP13.ETour.Models;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="tours")
public class Tours {
	
	@Id
	@Column(name="tour_id")
	private int tour_id;
	private String tour_type;
	private String tour_location;
	private String package_type;
	private String package_name;
	private String package_desc;
	private String start_date;
	private String end_date;
	private int filled_seats;
	
	

	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="tour_id")
	private Set<Booking> bookings;
	
	private int no_of_travellers;
	private int package_cost;
	
	
	public Tours(int tour_id, String tour_type, String tour_location, String package_type, String package_name,
			String package_desc, String start_date, String end_date, int no_of_travellers,int filled_seats,
			int package_cost) {
		super();
		this.tour_id = tour_id;
		this.tour_type = tour_type;
		this.tour_location = tour_location;
		this.package_type = package_type;
		this.package_name = package_name;
		this.package_desc = package_desc;
		this.start_date = start_date;
		this.end_date = end_date;
		
		this.no_of_travellers = no_of_travellers;
		this.package_cost = package_cost;
		this.filled_seats=filled_seats;
		
	}
	
	
	public Tours() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getFilled_seats() {
		return filled_seats;
	}


	public void setFilled_seats(int filled_seats) {
		this.filled_seats = filled_seats;
	}
	public int getTour_id() {
		return tour_id;
	}
	public void setTour_id(int tour_id) {
		this.tour_id = tour_id;
	}
	public String getTour_type() {
		return tour_type;
	}
	public void setTour_type(String tour_type) {
		this.tour_type = tour_type;
	}
	public String getTour_location() {
		return tour_location;
	}
	public void setTour_location(String tour_location) {
		this.tour_location = tour_location;
	}
	public String getPackage_type() {
		return package_type;
	}
	public void setPackage_type(String package_type) {
		this.package_type = package_type;
	}
	public String getPackage_name() {
		return package_name;
	}
	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}
	public String getPackage_desc() {
		return package_desc;
	}
	public void setPackage_desc(String package_desc) {
		this.package_desc = package_desc;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public int getNo_of_travellers() {
		return no_of_travellers;
	}
	public void setNo_of_travellers(int no_of_travellers) {
		this.no_of_travellers = no_of_travellers;
	}
	public int getPackage_cost() {
		return package_cost;
	}
	public void setPackage_cost(int package_cost) {
		this.package_cost = package_cost;
	}
	
	

}