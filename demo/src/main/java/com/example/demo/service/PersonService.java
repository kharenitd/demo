package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;
@Service
public class PersonService {
	private   PersonDao personDao;
	@Autowired
	public PersonService(@Qualifier("FakeDao") PersonDao personDao) {
		this.personDao = personDao;
	}
	
	public int addPerson(Person person) {
		return personDao.inserPerson(person);
	}
	public List<Person> getAllPerson(){
		return personDao.getAllPerson();
	}
}
