package com.java.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 	Serialization With Respect To Inheritance
 	
 	Case 1: Only Parent class implements Serializable interface 
 	- If Parent class implements Serializable then automatically every child class by default implements Serializable
 	- i.e., Serializable nature is inheriting from parent to child.
 	- Hence even though child class doesn't implements Serializable, we can serialize child class object.
 	
 	
 	Case 2: Only Child class implements Serializable interface
 	- Even though parent class does not implements Serializable we can serialize child object 
 	  if child class implements Serializable interface.
 	- At the time of serialization JVM ignores the values of instance variables 
 	  which are coming from non Serializable parent.
 	- Instead of original value JVM saves default values for those instance variables of Parent class to the file.
 	- At the time of Deserialization JVM checks whether any Parent class is Serializable or not.
 	- If any parent class is non Serializable JVM creates a separate object for every non Serializable parent
 	  and shares its instance variables to the current object.
 	- To create an object for non-serializable parent JVM always calls no arg constructor
 	  (default constructor) of that non Serializable parent.
 	- Hence every non Serializable parent should compulsory contain no arg constructor 
 	  otherwise we will get runtime exception "InvalidClassException".
 	- If non-serializable parent is abstract class then just instance control flow will be performed
 	  and share it's instance variable to the current object.
 	  
 	  
*/

//e.g., case 1:

class Car implements Serializable {
	String s = "I am car";
	
}

class Kia extends Car{
	String k = "I am KIA car.";
}


// case 2: 

class Parent {
	
	String s = "I am a Parent string";
	
	public Parent() {
		System.out.println("Parent default constructor.");
	}
}

class Child extends Parent implements Serializable {
	String s1 = "I am a child string";
	public Child() {
		System.out.println("Child default constructor.");
	}
}


public class SerializationWithRespectToInheritance {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileOutputStream fos = new FileOutputStream("new.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			FileInputStream fis = new FileInputStream("new.txt");
			ObjectInputStream ois = new ObjectInputStream(fis))
		{	
			Kia kia = new Kia();
			System.out.println(kia.s+"..........."+kia.k);
			oos.writeObject(kia);
			System.out.println("Serialization done.");
			
			Kia kia2 = (Kia) ois.readObject();
			System.out.println(kia2.s+"..........."+kia2.k);
			
			
			Child child = new Child();
			System.out.println(child.s+"............."+child.s1);
			oos.writeObject(child);
			System.out.println("Serialization done.");
			
			Child child2 = (Child) ois.readObject();
			System.out.println(child2.s+"............."+child2.s1);
			
		} catch (Exception e) {
			
		}
	}

}
