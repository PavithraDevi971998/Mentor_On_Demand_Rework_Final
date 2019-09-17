package com.example.Mentor_on_demand.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.Mentor_on_demand.model.MentorSkills;

public interface SkillsRepository extends CrudRepository<MentorSkills, Long> {

	
	List<MentorSkills> findByName(String name);

}
