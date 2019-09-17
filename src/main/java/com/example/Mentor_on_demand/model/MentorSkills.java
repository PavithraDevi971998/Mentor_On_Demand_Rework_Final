package com.example.Mentor_on_demand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mentorSkills")
public class MentorSkills {

	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="mid")
	private long mid;
	
	@Column(name="sid")
	private long sid;
	
	@Column(name="self_rating")
	private int self_rating;
	
	@Column(name="years_of_exp")
	private float years_of_exp;
	
	@Column(name="trainings_delivered")
	private String trainings_delivered;
	
	@Column(name="facities_offered")
	private String facities_offered;

	@Column(name="name")
	private String name;
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public MentorSkills() {
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

	public long getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getSelf_rating() {
		return self_rating;
	}

	public void setSelf_rating(int self_rating) {
		this.self_rating = self_rating;
	}

	public float getYears_of_exp() {
		return years_of_exp;
	}

	public void setYears_of_exp(int years_of_exp) {
		this.years_of_exp = years_of_exp;
	}

	public String getTrainings_delivered() {
		return trainings_delivered;
	}

	public void setTrainings_delivered(String trainings_delivered) {
		this.trainings_delivered = trainings_delivered;
	}

	public String getFacities_offered() {
		return facities_offered;
	}

	public void setFacities_offered(String facities_offered) {
		this.facities_offered = facities_offered;
	}

	@Override
	public String toString() {
		return "MentorSkills [id=" + id + ", mid=" + mid + ", sid=" + sid + ", self_rating=" + self_rating
				+ ", years_of_exp=" + years_of_exp + ", trainings_delivered=" + trainings_delivered
				+ ", facities_offered=" + facities_offered + "]";
	}
	
	
	
	
}
