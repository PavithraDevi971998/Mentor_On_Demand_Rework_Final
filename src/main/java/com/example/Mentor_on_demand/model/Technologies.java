package com.example.Mentor_on_demand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="technologies")
public class Technologies {
	
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="TOC")
	private String TOC;
	
	@Column(name="duration")
	private String duration;
	
	@Column(name="prerequites")
	private String prerequites;
	
	@Column(name="start_time")
	private String start_time;
	
	@Column(name="mentor_id")
	private Long mentor_id;

	

	public Long getMentor_id() {
		return mentor_id;
	}

	public void setMentor_id(Long mentor_id) {
		this.mentor_id = mentor_id;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	

	

	public Technologies(long id, String name, String tOC, String duration, String prerequites, String start_time,
			Long mentor_id) {
		super();
		this.id = id;
		this.name = name;
		TOC = tOC;
		this.duration = duration;
		this.prerequites = prerequites;
		this.start_time = start_time;
		this.mentor_id = mentor_id;
	}

	public Technologies() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTOC() {
		return TOC;
	}

	public void setTOC(String tOC) {
		TOC = tOC;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getPrerequites() {
		return prerequites;
	}

	public void setPrerequites(String prerequites) {
		this.prerequites = prerequites;
	}

	@Override
	public String toString() {
		return "Technologies [id=" + id + ", name=" + name + ", TOC=" + TOC + ", duration=" + duration
				+ ", prerequites=" + prerequites + "]";
	}
	

}
