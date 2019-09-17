package com.example.Mentor_on_demand.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.Mentor_on_demand.model.Technologies;
import com.example.Mentor_on_demand.model.User;

public interface UserRepository extends CrudRepository<User , Long> {
       Optional<User> findById(long id);

    @Query("select c from Technologies c where c.name=:name and c. start_time=:start_time" )   
	List<Technologies> findTechnology(@Param("name") String name, @Param("start_time") String start_time);

    @Query("select c from User c where c.username=:username and c.password=:password")   
	User findUser(String username, String password);

	
      
	
}
