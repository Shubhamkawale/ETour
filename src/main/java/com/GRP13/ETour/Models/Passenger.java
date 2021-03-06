package com.GRP13.ETour.Models;

import javax.persistence.*;

@Entity
@Table(name="passenger")
public class Passenger {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	private String pname;
	private int age;
	private long uid;
	private String email;
	private String address;
	private int phoneno;
	
	

	
	
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passenger(int pid, String pname, int age, long uid, String email, String address, int phoneno,
			Booking booking) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.age = age;
		this.uid = uid;
		this.email = email;
		this.address = address;
		this.phoneno = phoneno;
		
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

	
	
	

}