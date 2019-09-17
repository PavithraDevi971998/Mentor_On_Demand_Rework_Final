package com.example.Mentor_on_demand.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mentor_on_demand.model.Technologies;
import com.example.Mentor_on_demand.model.Trainings;
import com.example.Mentor_on_demand.repo.TechnologiesRepository;
import com.example.Mentor_on_demand.repo.TrainingsRepository;





@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class TrainingsController {
	
	@Autowired
	TrainingsRepository trainingrepo;
	
	@Autowired
	TechnologiesRepository techrepo;
	
	@GetMapping("/trainings")
	public List<Trainings> getAllCustomers() {
		System.out.println("Get all Customers...");
        
		List<Trainings> trainings = new ArrayList<>();
		
		trainingrepo.findAll().forEach(trainings::add);

		return trainings;
	}
	
	
	@PostMapping(value = "/trainings/create")
	public Trainings createTraining(@RequestBody Technologies technology) {

    Trainings _trainings=new Trainings();
    _trainings.setMentor_id(technology.getMentor_id());
    _trainings.setUser_id("Proposed");
    trainingrepo.save(_trainings);
	return _trainings;
	}
	
	@GetMapping("/propose/{id}")
	public ResponseEntity<Trainings> updateTrainings(@PathVariable("id") long id, @RequestBody Trainings training) {
		
		System.out.println("inside propose");
		System.out.println("Update Trainings with id = " + id + "...");

		Optional<Trainings> trainingdata = trainingrepo.findById(id);

		if (trainingdata.isPresent()) {
			Trainings _training = trainingdata.get();
			_training.setStatus("proposed");
			return new ResponseEntity<>(trainingrepo.save(_training), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}


	 @GetMapping("/trainings/fetch/{username}") 
	 public List<Trainings>getAllCustomers(@PathVariable("username") String username)
	 {
	 System.out.println("Get all trainings details..."); 
	 List<Trainings> trainings=trainingrepo.getTrainings(username);
	 return trainings;
	 }
	 
@GetMapping(value = "getCompletedTrainings/{status}")
public List<Trainings> findByStatus(@PathVariable String status) {

	List<Trainings> trainings= trainingrepo.findByStatus(status);
	return trainings;
}

@GetMapping("/allTrainings")
public List<Technologies> findAllTrainings(){
	List<Technologies> _trainings=trainingrepo.findAllTechnologies();
	return _trainings;
}

@PostMapping(value = "/trainings/create1/{username}")
public Trainings createUserTraining(@RequestBody Technologies technology,@PathVariable("username") String username) {
	System.out.println("Inside trinings");
Trainings _trainings=new Trainings();
_trainings.setMentor_id(technology.getMentor_id());
_trainings.setUser_id("1");
long mid=technology.getMentor_id();
String mentor=techrepo.findName(mid);
_trainings.setMentor_name(mentor);
_trainings.setStatus("Proposed");
_trainings.setUsername(username);
_trainings.setTraining_name(technology.getName());
trainingrepo.save(_trainings);
return _trainings;
}

@PostMapping(value = "/trainings/create/{username}")
public Trainings createTraining(@RequestBody Technologies technology,@PathVariable ("username") String username) {

	System.out.println("inside create training");	
	Trainings _training=new Trainings();
	String MentorName=techrepo.findMentor(technology.getMentor_id());
	_training.setMentor_name(MentorName);
	_training.setUser_id("1");
	_training.setUsername(username);
	_training.setMentor_id(technology.getMentor_id());
	_training.setStatus("Proposed");
	_training.setTraining_name(technology.getName());
	trainingrepo.save(_training);
	
	
	return _training;
}

@GetMapping("/trainings/proposed/{username}")
public List<Trainings> getProposedTrainings(@PathVariable("username") String username){
	String status="proposed";
	List<Trainings> _trainings=trainingrepo.findProposed(username,status); 
	return _trainings;
}

@GetMapping("/trainings/mentor/fetch/{username}") 
public List<Trainings>getAllMentorTrainings(@PathVariable("username") String username)
{
System.out.println("Get all Mentor trainings details..."); 
System.out.println(username);
List<Trainings> trainings=trainingrepo.getMentorTrainings(username);
return trainings;
}


}
