package com.example.Mentor_on_demand.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.Mentor_on_demand.model.Mentor;

public interface MentorRepository extends CrudRepository<Mentor, Long> {

	@Query("select c from Mentor c where c.username=:username and c.password=:password")  
	Mentor findMentor(String username, String password);

	@Query("select c from Mentor c where c.username=:username")
	Mentor findMentorProfile(String username);

}
