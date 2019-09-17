package com.example.Mentor_on_demand.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public User() {
		super();
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public String getReg_datetime() {
		return reg_datetime;
	}

	public void setReg_datetime(String reg_datetime) {
		this.reg_datetime = reg_datetime;
	}

	public String getReg_code() {
		return reg_code;
	}

	public void setReg_code(String reg_code) {
		this.reg_code = reg_code;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	
	@Column(name="contact_number")
	private String contact_number;
	
	
	@Column(name="reg_datetime")
	private String reg_datetime;
	
	@Column(name="reg_code")
	private String reg_code;
	
	@Column(name="active")
	private boolean active;


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", contact_number=" + contact_number + ", reg_datetime=" + reg_datetime
				+ ", reg_code=" + reg_code + ", active=" + active + "]";
	}

	public User( String username, String password, String firstname, String lastname, String contact_number) {
		
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.contact_number = contact_number;
		this.reg_datetime = "date";
		this.reg_code = "REgCode";
		this.active = true;
	}

	
	}
	
	
	
	

