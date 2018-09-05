package com.karan.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class Customer {
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Customer(int id, String firstname, String lastname, String email) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="FIRSTNAME")
	private String firstname;
	@Column(name="LASTNAME")
	private String lastname;
	@Column(name="EMAIL")
	private String email;
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
	}
}
