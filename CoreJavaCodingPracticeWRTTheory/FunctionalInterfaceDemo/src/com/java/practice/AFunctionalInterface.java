package com.java.practice;

import java.util.HashMap;
import java.util.function.Function;

public class AFunctionalInterface {

	private static HashMap<Integer, String> Employee = new HashMap<>();	
	
	public static void main(String[] args) {
		
        Employee.put(1045,"Tom Jones");
        Employee.put(1065, "Nancy Smith");
        Employee.put(1029, "Deborah Sprightly");
        Employee.put(1025, "Ethan Hardy");
        
        // foreach loop using lambda Expression
        Employee.forEach((k,v)-> {
        	System.out.println(k + " " + v);
        });
     
        Function<Integer, String> getEmp = (Integer ID) -> 
        {
        	if(Employee.containsKey(ID)) return Employee.get(ID);
        	else 
        		return "Employee is not valid";
        };
        
        System.out.println(" ");
        // apply is an abstract method in Function built-in interface.
        System.out.println("ID 1029 " + "Name is  " + getEmp.apply(1029) );
	}

}

class Employee{
	Integer id;
	String name;
	
	public Employee(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
}