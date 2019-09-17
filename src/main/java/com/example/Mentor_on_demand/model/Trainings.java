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
@Table(name="trainings")
public class Trainings {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="user_id")
	private String user_id;
	
	@Column(name="mentor_id")
	private Long mentor_id;
	
	@Column(name="skill_id")
	private String skill_id;
	
	@Column(name="status")
	private String status;
	
	@Column(name="progress")
	private int progress;
	
	@Column(name="rating")
	private int rating;
	
	@Column(name="username")
	private String username;
	
	@Column(name="training_name")
	private String training_name;
	
	@Column(name="mentor_name")
	private String mentor_name;

	public String getMentor_name() {
		return mentor_name;
	}

	public void setMentor_name(String mentor_name) {
		this.mentor_name = mentor_name;
	}

	

	

	

	public Long getMentor_id() {
		return mentor_id;
	}

	public void setMentor_id(Long mentor_id) {
		this.mentor_id = mentor_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	public Trainings(long id, String user_id, Long mentor_id, String skill_id, String status, int progress, int rating,
			String username, String training_name, String mentor_name, String start_date, String end_date,
			String start_time, String end_time, float amount_received) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.mentor_id = mentor_id;
		this.skill_id = skill_id;
		this.status = status;
		this.progress = progress;
		this.rating = rating;
		this.username = username;
		this.training_name = training_name;
		this.mentor_name = mentor_name;
		this.start_date = start_date;
		this.end_date = end_date;
		this.start_time = start_time;
		this.end_time = end_time;
		this.amount_received = amount_received;
	}

	public String getTraining_name() {
		return training_name;
	}

	public void setTraining_name(String training_name) {
		this.training_name = training_name;
	}

	@Column(name="start_date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private String start_date;
	
	@Column(name="end_date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private String end_date;
	
	@Column(name="start_time")
	@JsonFormat(pattern="HH:mm:ss")
	private String start_time;
	
	@Column(name="end_time")
	@JsonFormat(pattern="HH:mm:ss")
	private String end_time;
	
	@Column(name="amount_received")
	private float amount_received;

	public Trainings() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	

	public String getSkill_id() {
		return skill_id;
	}

	public void setSkill_id(String skill_id) {
		this.skill_id = skill_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
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

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public float getAmount_received() {
		return amount_received;
	}

	public void setAmount_received(float amount_received) {
		this.amount_received = amount_received;
	}

	@Override
	public String toString() {
		return "Trainings [id=" + id + ", user_id=" + user_id + ", mentor_id=" + mentor_id + ", skill_id=" + skill_id
				+ ", status=" + status + ", progress=" + progress + ", rating=" + rating + ", start_date=" + start_date
				+ ", end_date=" + end_date + ", start_time=" + start_time + ", end_time=" + end_time
				+ ", amount_received=" + amount_received + "]";
	}
}
