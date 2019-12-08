package com.example.demo.dao;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;
@Repository("FakeDao")
public class FakepersonDataAccessService implements PersonDao{
	public static List<Person> DB  = new ArrayList<Person>();
	@Override
	public int inserPerson(UUID id, Person person) {
		DB.add(new Person(id ,person.getName()));
		return 1; 
	}
	@Override
	public List<Person> getAllPerson() {
		return DB;
	}
    
}
