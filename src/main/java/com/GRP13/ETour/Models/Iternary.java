package com.GRP13.ETour.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Iternary")
public class Iternary {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int iternary_id;
	@Column(name="Iternary_details")
	String Iternary_details;
	@Column(name="day_no")
	int day_no;
	@Column(name="package_id")
	int package_id;
	
	
	public Iternary() {
		
	}
	
	
	public Iternary(int iternary_id, String iternary_details, int day_no, int package_id) {
		super();
		this.iternary_id = iternary_id;
		Iternary_details = iternary_details;
		this.day_no = day_no;
		this.package_id = package_id;
	}
	
	
	public int getIternary_id() {
		return iternary_id;
	}
	public void setIternary_id(int iternary_id) {
		this.iternary_id = iternary_id;
	}
	public String getIternary_details() {
		return Iternary_details;
	}
	public void setIternary_details(String iternary_details) {
		Iternary_details = iternary_details;
	}
	public int getDay_no() {
		return day_no;
	}
	public void setDay_no(int day_no) {
		this.day_no = day_no;
	}
	public int getPackage_id() {
		return package_id;
	}
	public void setPackage_id(int package_id) {
		this.package_id = package_id;
	}
	
	
	

}
