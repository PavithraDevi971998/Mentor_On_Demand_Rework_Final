package com.example.Mentor_on_demand.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="mentor")
public class Mentor {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="contact_number")
	private String contact_number;
	
	@Column(name="password")
	private String password;

	
	
	public Mentor(long id, String username, String firstname, String lastname, String contact_number, String password,
			String linkedin_url, String reg_datetime, String reg_code, float years_of_experience, boolean active) {
		super();
		this.id = id;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.contact_number = contact_number;
		this.password = password;
		this.linkedin_url = linkedin_url;
		this.reg_datetime = reg_datetime;
		this.reg_code = reg_code;
		this.years_of_experience = years_of_experience;
		this.active = active;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Column(name="linkedin_url")
	private String linkedin_url;
	
	@Column(name="reg_datetime")
	@JsonFormat(pattern="yyyy-MM-dd")
	private String reg_datetime;
	
	

	@Column(name="reg_code")
	private String reg_code;
	
	@Column(name="years_of_experience")
	private float years_of_experience;
	
	@Column(name="active")
	private boolean active;
	
	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLinkedin_url() {
		return linkedin_url;
	}

	public void setLinkedin_url(String linkedin_url) {
		this.linkedin_url = linkedin_url;
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

	public float getYears_of_experience() {
		return years_of_experience;
	}

	public void setYears_of_experience(float years_of_experience) {
		this.years_of_experience = years_of_experience;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	} 

	public Mentor() {
		super();
	}

	
	@Override
	public String toString() {
		return "Mentor [id=" + id + ", username=" + username + ", linkedin_url=" + linkedin_url + ", reg_datetime="
				+ reg_datetime + ", reg_code=" + reg_code + ", years_of_experience=" + years_of_experience + ", active="
				+ active + "]";
	}

}
