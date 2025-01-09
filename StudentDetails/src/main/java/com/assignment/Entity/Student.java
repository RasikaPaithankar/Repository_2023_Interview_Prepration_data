package com.assignment.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String rollNumber;
	private String name;
	private Integer age;
	private String address;
	private List<Subject> subject;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String rollNumber, String name, Integer age, String address, List<Subject> subject) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
		this.address = address;
		this.subject = subject;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Subject> getSubject() {
		return subject;
	}
	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", age=" + age + ", address=" + address
				+ ", subject=" + subject + "]";
	}
}
