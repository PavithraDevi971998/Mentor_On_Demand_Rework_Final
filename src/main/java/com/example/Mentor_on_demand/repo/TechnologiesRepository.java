package com.example.Mentor_on_demand.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.Mentor_on_demand.model.Technologies;

public interface TechnologiesRepository extends CrudRepository<Technologies, Integer> {

	@Query("select c.username from Mentor c where c.id=:mid")
	String findName(long mid);
	
	@Query("Select c.username From Mentor c where c.id = :id")
	String findMentor(Long id);

}
