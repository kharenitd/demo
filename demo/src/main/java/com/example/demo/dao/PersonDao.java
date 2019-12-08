package com.example.demo.dao;

import java.util.*;

import com.example.demo.model.Person;

public interface PersonDao {
	int inserPerson(UUID id , Person person);
	default int inserPerson(Person  person) {
		UUID id = UUID.randomUUID();
		return inserPerson(id, person);
	}
	List<Person> getAllPerson();
}
