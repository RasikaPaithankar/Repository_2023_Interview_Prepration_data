package com.java.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 ***Serialization***
 	
  - The process of writing a state of an object to a file, is called Serialization.
  	(Converting object from java supported to network or file supported form.)
  -	By using FileOutputStream and ObjectOutputStream classes, we can achieve serialization.
  
 ***Deserialization***
  	
  -	The process of reading a state of an object from the file is called Deserialization.
  	(Converting object from network or file supported to Java supported form)
  -	By using FileInputStream or ObjectInputStream classes, we can achieve Deserialization.
  	
  	
  -	We can perform Serialization only for Serializable objects.
  -	An object is said to be Serializable if and only if the corresponding class implements Serializable interface.
  -	Serializable interface present in java.io package and does not contain any methods. 
  -	It is marker interface. The required ability will be provided automatically by JVM.
  -	If we are trying to serialize a non-serializable object 
  	then we will get RuntimeException saying "NotSerializableException".
  -	We can add any no. Of objects to the file and we can read all those objects from the file 
  	but in which order we wrote objects in the same order only the objects will come back. 
  	That is order is important.
 
 
 ***Transient Keyword***
 
  -	transient is the modifier applicable only for variables.
  -	While performing serialization, if we don't want to save particular value of variable to meet security constant
  	such type of variable we should declare as a transient.
  -	At the time of serialization JVM ignores the original value of transient variable 
  	and save default value to the file.
  -	That is transient means "not to serialize".
  -	After Deserialization, object can not provide value of transient variable.
  
  static variable with transient keyword.
  - we can not use transient keyword with static variables as they are not part of objects. 
  
  final variable with transient keyword.
  -	final variables will be participated into serialization directly by their values.
   	Hence declaring a final variable as transient there is no use.
  - the compiler assign the value to final variable.
  
  
  declaration							output					value save in a file
 1.	int i=10;						10..........20					10..........20				
	int j=20;	
 2. transient int i=10;				0...........20					0...........20
	int j=20;	
 3.	transient int i=10;				0...........20					0...........static value will 
 	transient static int j=20;													not save in a file
 4. transient int i=10;				0...........20					0...........20
	transient final int j=20;
	
	
 ***Object graph in serialization***
 1.	Whenever we are serializing an object, the set of all objects which are reachable from that object will be 
 	serialized automatically.
 2.	This group of objects is nothing but object graph in serialization.
 3.	In object graph every object should be Serializable otherwise 
 	we will get runtime exception saying "NotSerializableException".
	
*/

class Dog implements Serializable {
	int i = 10;
	int k = 20;
	transient String str = "I am transient variable";
// static variables won't participate in serialization as static variable is not part of object state.
	static transient String str1 = "I am a static variable";
// will store in a file as non-transient and final
	final String str2 = "I am final and non-transiet variable";
// will store in a file as transient
	final transient String str3 = "I am final and transiet variable"; 
}

class Cat {
	String cat ="Cat";
}

class Horse implements Serializable{
	String horse = "I am Horse";
// static variables won't participate in serialization as static variable is not part of object state.	
	static String str = "I am a static variable";
}

/*
  ***Object graph in serialization***
  -	All classes implements Serializable.
  -	If any class does not implement Serializable it will throw an exception "NotSerializableException".
  
*/

class A implements Serializable {
	B b = new B();
}
class B implements Serializable{
	C c = new C();
}
class C implements Serializable{
	int i = 20;
}


public class Serialization {

	public static void main(String[] args) throws ClassNotFoundException {
		Dog d = new Dog();	
		Cat cat = new Cat();
		Horse horse = new Horse();
		A a = new A();
		//try with resources
		try(FileOutputStream fileOutputStream = new FileOutputStream("abc.txt"); 
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			FileInputStream fileInputStream = new FileInputStream("abc.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream))
		{
			System.out.println("Serialization started.");
			objectOutputStream.writeObject(d);
			objectOutputStream.writeObject(horse);
//	java.io.NotSerializableException: com.java.practice.Cat
//			objectOutputStream.writeObject(cat);

//	Object graph in serialization			
			objectOutputStream.writeObject(a);
			
			System.out.println("Serialization ended.");
			
			System.out.println("Deserializaton started.");
			Dog d2 = (Dog) objectInputStream.readObject();
			Horse horse1 = (Horse) objectInputStream.readObject();
			System.out.println("Deserializaton ended.");
			
			System.out.println(d2.i+"..........."+d2.k+"..........."+d2.str+
					"..........."+d2.str1+"..........."+d2.str2+"..........."+d2.str3);
			System.out.println(horse1.horse);
			
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

}
