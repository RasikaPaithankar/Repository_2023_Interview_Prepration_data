package com.java.practice;

public class Person {
	int age;
	String fName;
	String lName;
	
	public Person(int age, String fName, String lName) {
		this.age = age;
		this.fName = fName;
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", fName=" + fName + ", lName=" + lName + "]";
	}	
	
}
