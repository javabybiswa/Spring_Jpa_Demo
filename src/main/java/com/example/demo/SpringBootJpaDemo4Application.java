package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJpaDemo4Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootJpaDemo4Application.class, args);
		
		       Patient2DbOperation db= context.getBean(Patient2DbOperation.class);
		       
		       System.out.println("adding Patient");
		       db.addPatient("rakhi", 25, "female", "five@gmail.com",865749856l);
		       
		          
	}

}
