package com.rebel.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private  String pName;
	private String pSuranme;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Person(Integer id, String pName, String pSuranme) {
		super();
		this.id = id;
		this.pName = pName;
		this.pSuranme = pSuranme;
	}



	public Integer  getId() {
		return id;
	}
	public void setId(Integer  id) {
		this.id = id;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpSuranme() {
		return pSuranme;
	}
	public void setpSuranme(String pSuranme) {
		this.pSuranme = pSuranme;
	}
	
	
	

}
