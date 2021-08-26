package com.GRP13.ETour.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int customer_id;
	@Column(name="customer_Fname")
	String customer_Fname;
	@Column(name="customer_Lname")
	String customer_Lname;
	@Column(name="phoneno")
	int phoneno;
	@Column(name="Address")
	String Address;
	@Column(name="age")
	int age;
	@Column(name="uid")
	int uid;
	@Column(name="email")
	String email;
	
	
	public Customer() {
		
	}
	
	public Customer(int customer_id, String customer_Fname, String customer_Lname, int phoneno, String address, int age,
			int uid, String email) {
		super();
		
		
		this.customer_id = customer_id;
		this.customer_Fname = customer_Fname;
		this.customer_Lname = customer_Lname;
		this.phoneno = phoneno;
		Address = address;
		this.age = age;
		this.uid = uid;
		this.email = email;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_Fname() {
		return customer_Fname;
	}
	public void setCustomer_Fname(String customer_Fname) {
		this.customer_Fname = customer_Fname;
	}
	public String getCustomer_Lname() {
		return customer_Lname;
	}
	public void setCustomer_Lname(String customer_Lname) {
		this.customer_Lname = customer_Lname;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
