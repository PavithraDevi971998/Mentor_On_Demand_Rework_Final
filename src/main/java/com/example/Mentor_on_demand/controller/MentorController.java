package com.example.Mentor_on_demand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mentor_on_demand.model.Mentor;
import com.example.Mentor_on_demand.model.User;
import com.example.Mentor_on_demand.repo.MentorRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api4")
public class MentorController {

	@Autowired
	MentorRepository mentorrepo;
	
	@PostMapping(value="/create")
	public Mentor registerUser(@RequestBody Mentor mentor) {
		System.out.println("inside");
		Mentor mentor1=mentorrepo.save(mentor);
		return mentor1;
	}
	
	@GetMapping("/checkMentor/{username}/{password}")
	public Mentor checkUser(@PathVariable("username") String username,@PathVariable("password") String password){
		System.out.println("inside mentor");
		Mentor mentor=mentorrepo.findMentor(username,password);
		return mentor;
	}
	
	@GetMapping("/getMentorProfile/{username}")
	public Mentor getMentor(@PathVariable("username") String username){
		System.out.println(username);
		System.out.println("inside mentor profile");
		Mentor mentor=mentorrepo.findMentorProfile(username);
		System.out.println(mentor.getUsername());
		return mentor;
	}
}
