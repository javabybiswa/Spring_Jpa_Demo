package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Patient2DbOperation {

	 @Autowired
	 Patient2Repository repository;	
	 
	 public void addPatient(String name,int age,String gender,String email, long contact) {
		 repository.addPatient(name, email, age, contact,gender);
	 }
	
}
