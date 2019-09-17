package com.example.Mentor_on_demand.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mentor_on_demand.model.MentorSkills;
import com.example.Mentor_on_demand.repo.SkillsRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api3")
public class SkillsController {
    @Autowired
	SkillsRepository skillsRepo;
	  
	@GetMapping("/getSkillsDetails/{id}")
	public Optional<MentorSkills> getAllSkills(@PathVariable long id) {
		System.out.println("Get all skills details...");

		
		Optional<MentorSkills> skills=skillsRepo.findById(id);

		return skills;
	}
	
	@GetMapping("/getSkills/{name}")
	public List<MentorSkills> getSkills(@PathVariable String name){
		
		List<MentorSkills> _skills=skillsRepo.findByName(name);
		
		return _skills;
	}
	
	
}
