package com.java.fortytwolabs.pojo;

import java.util.ArrayList;

public class Student {
	private String name;
    private Integer age;
    private String address;
    ArrayList<Subject> subjects;
    public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, Integer age, String address, ArrayList<Subject> subjects) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.subjects = subjects;
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
	public ArrayList<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(ArrayList<Subject> subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", subjects=" + subjects + "]";
	} 
}
