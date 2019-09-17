package com.example.Mentor_on_demand.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mentor_on_demand.model.Technologies;
import com.example.Mentor_on_demand.model.Trainings;
import com.example.Mentor_on_demand.model.User;
import com.example.Mentor_on_demand.repo.UserRepository;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api1")
public class UserController {
	@Autowired
	UserRepository userRepo;
	
	@PostMapping(value="/create")
	public User registerUser(@RequestBody User user) {
		System.out.println("inside");
		User user1=userRepo.save(user);
		return user1;
	}
	
	@GetMapping("/gettechnology/{name}/{start_time}")
	public List<Technologies> getTechnologies(@PathVariable("name") String name,@PathVariable("start_time") String start_time){
		System.out.println("inside serach technologies");
		List<Technologies> _technologies=userRepo.findTechnology(name,start_time);
		return _technologies;
	}
	
	@GetMapping("/checkUser/{username}/{password}")
	public User checkUser(@PathVariable("username") String username,@PathVariable("password") String password){
		System.out.println("inside user");
		User user=userRepo.findUser(username,password);
		return user;
	}
}
