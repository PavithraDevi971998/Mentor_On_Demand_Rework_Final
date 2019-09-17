package com.example.Mentor_on_demand.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.Mentor_on_demand.model.Admin;

public interface AdminRepository extends CrudRepository<Admin, Long> {

	@Query("select c from Admin c where c.username=:username and c.password=:password") 
	Admin findAdmin(String username, String password);

}
