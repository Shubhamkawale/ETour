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

}
