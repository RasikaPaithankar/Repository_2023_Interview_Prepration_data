package com.java.practice;

/*
 * if the requirement same for every object then instead of creating separate object for every object 
 * we can create only one object and share with every object 
 * e.g., school details will be same for every student 
 * 		 then we will create school as singleton object and will share with every student object. 
 * 
 *  advantages
 *  1.Performance will be improved.
 *  2.memory utilization will be improved.
 *  
*/

/*
 * Rule to create singleton class
 * 1. must have private constructor.
 * 2. must have static variables.
 * 3. must include factory method
 * 
 *  what is factory method? 
 *  the method in a class which return only same class type in which it is declared.
 * Note - it should be static only.
 *  
 *  e.g., biscuit factory will give output of biscuit.
 * 	In short, method return type same as class in which it is declared.
 * 
*/
class School {
	static String schoolName;
	static String schoolAddress;
	int rate;
	static School school;
	
	// can not create child class for School class as constructor is private.
	// such that only one object will create.
	private School() {
		
	}
	
	public static School getSchool() {
		if(school==null) {
			school = new School();
			School.schoolAddress = "Baner-Pashan link road";
			School.schoolName = "DON Bosco school";
			System.out.println(School.schoolAddress);
			System.out.println(School.schoolName);
			System.out.println(school.getRate());
		}
		return school;
	}
	
	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

}

// if we try to create child class of a class which has only private constructor it throws an C.E.
// "Implicit super constructor School() is not visible for default constructor. Must define an explicit constructor"
//
//	class student extends School{
//		
//	}

public class SingleTon {

	public static void main(String[] args) {
		System.out.println(School.getSchool().hashCode());
		System.out.println(School.getSchool().hashCode());
	}

}
