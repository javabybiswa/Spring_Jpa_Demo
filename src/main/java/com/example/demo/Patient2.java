package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table

public class Patient2 {
	
    @Id
	@Column
	 private String emailid;
	
	@Column
	 private String name;
	@Column
	 private int age;
	@Column
	 private String gender;
	@Column
	 private long contact;
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Patient2 [emailid=" + emailid + ", name=" + name + ", age=" + age + ", gender=" + gender + ", contact="
				+ contact + "]";
	}
	
	

}

