package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {
	 private PersonService personService;
	 @Autowired
	 public PersonController(PersonService personService) {
		 this.personService = personService;
	 }
	 @PostMapping  
	 public void addperson(@RequestBody Person person) {
		  personService.addPerson(person); 
	 }
	 @GetMapping
	 List<Person> getAllPeople(){
		return personService.getAllPerson();
		 
	 }
}
