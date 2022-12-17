package com.rebel.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rebel.test.entity.Person;
import com.rebel.test.service.PersonService;

@RestController
public class PersonController 
{
	@Autowired
	private PersonService service;
	
	@GetMapping("/Person")
	public ResponseEntity<List<Person>> getList()
	{
		List<Person> list = service.getAllPerson();
		return ResponseEntity.ok(list);
	}
	
	

}
