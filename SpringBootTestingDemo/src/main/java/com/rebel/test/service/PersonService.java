package com.rebel.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rebel.test.entity.Person;
import com.rebel.test.repo.PersonRepo;



@Service
public class PersonService 
{
	@Autowired
	private PersonRepo repo;
	
	public List<Person> getAllPerson()
	{
		return this.repo.findAll();
	}

}
