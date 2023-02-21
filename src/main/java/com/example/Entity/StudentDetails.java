package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String name;
	private Integer age;
	private String email;
	private String password;
	private String address;
	
	
	public StudentDetails() {
		super();
	}


	public StudentDetails(Long id, String name, Integer age, String email, String password, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
		this.address = address;
	}


	public Long getId() {
		System.out.println("Student get id....");
		return id;
	}


	public void setId(Long id) {
		System.out.println("Student id ....");
		this.id = id;
	}


	public String getName() {
		System.out.println("Student  get name ....");
		return name;
	}


	public void setName(String name) {
		System.out.println("Student Name ....");
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		System.out.println("Student Age ....");
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		System.out.println("Student Email ....");
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		System.out.println("Student Password ....");
		this.password = password;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		System.out.println("Student Address ....");
		this.address = address;
	}


	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", password="
				+ password + ", address=" + address + "]";
	}
	
	
	
	
}
