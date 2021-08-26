package com.GRP13.ETour.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TourPackages")
public class TourPackages {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int package_id;
	@Column(name="package_type")
	String package_type;
	@Column(name="package_Destiantio")
	String package_Destiantion;
	@Column(name="package_cost")
	long package_cost;
	@Column(name="start_date")
	String start_date;
	@Column(name="end_date")
	String end_date;
	@Column(name="nos_travelers")
	int nos_travelers;
	
	
	
	public TourPackages()
	{
		
	}
	
	
	public TourPackages(String package_type, String package_Destiantion, long package_cost, int package_duration,
			int nos_travelers, String start_date, String end_date) {
		super();
		this.package_type = package_type;
		this.package_Destiantion = package_Destiantion;
		this.package_cost = package_cost;
		this.start_date = start_date;
		this.end_date = end_date;
		this.nos_travelers = nos_travelers;
	}
	
	
	public int getPackage_id() {
		return package_id;
	}
	public void setPackage_id(int package_id) {
		this.package_id = package_id;
	}
	public String getPackage_type() {
		return package_type;
	}
	public void setPackage_type(String package_type) {
		this.package_type = package_type;
	}
	public String getPackage_Destiantion() {
		return package_Destiantion;
	}
	public void setPackage_Destiantion(String package_Destiantion) {
		this.package_Destiantion = package_Destiantion;
	}
	public long getPackage_cost() {
		return package_cost;
	}
	public void setPackage_cost(long package_cost) {
		this.package_cost = package_cost;
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
	public int getNos_travelers() {
		return nos_travelers;
	}
	public void setNos_travelers(int nos_travelers) {
		this.nos_travelers = nos_travelers;
	}

}
