package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import jakarta.transaction.Transactional;


@Component
public interface Patient2Repository extends JpaRepository<Patient2,String>{
	
	 @Transactional
	 @Modifying
	 @Query(value="insert into patient2 values(emailid,name,age,gender,contact )",nativeQuery=true)
	 
	 public void addPatient(@Param("name")String name,
			               @Param("emailid")String email,
			               @Param("age")int age,
			               @Param("contact")long contact,
			               @Param("gender")String gender);
			             

}
