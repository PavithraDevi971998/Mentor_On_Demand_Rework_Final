package com.example.Mentor_on_demand.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="mentorCalendar")
public class MentorCalendar {

	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="mid")
	private long mid;
	
	@Column(name="start_time")
	@JsonFormat(pattern="HH-mm-ss")
	private String start_time;
	
	@Column(name="end_time")
	@JsonFormat(pattern="HH-mm-ss")
    private String end_time;
	
	@Column(name="start_date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private String start_date;
	
	@Column(name="end_date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private String end_date;

	public MentorCalendar() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
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

	@Override
	public String toString() {
		return "MentorCalendar [id=" + id + ", mid=" + mid + ", start_time=" + start_time + ", end_time=" + end_time
				+ ", start_date=" + start_date + ", end_date=" + end_date + "]";
	}
	
	
}
