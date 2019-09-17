package com.example.Mentor_on_demand.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.Mentor_on_demand.model.Technologies;
import com.example.Mentor_on_demand.model.Trainings;

public interface TrainingsRepository extends CrudRepository<Trainings, Long> {
	
	List<Trainings> findByStatus(String status);

	@Query("select c from Technologies c")
	List<Technologies> findAllTechnologies();

	@Query("select c from Trainings c where c.username=:username")
	List<Trainings> getTrainings(@Param("username") String username);

	@Query("select c from Trainings c where c.username=:username and c.status=:status")
	List<Trainings> findProposed(@Param("username") String username, @Param("status") String status);

	@Query("select c from Trainings c where c.mentor_name=:username")
	List<Trainings> getMentorTrainings(String username);

	

	
}
