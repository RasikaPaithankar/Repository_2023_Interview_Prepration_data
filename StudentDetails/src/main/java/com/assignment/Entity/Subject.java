package com.assignment.Entity;

public class Subject {
	
	private String subName;
	private Integer marks;
	
	public Subject() {
		// TODO Auto-generated constructor stub
	}

	public Subject(String subName, Integer marks) {
		super();
		this.subName = subName;
		this.marks = marks;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Subject [subName=" + subName + ", marks=" + marks + "]";
	}
}
