package com.java.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
	Customized serialization:

  -	During default Serialization there may be a chance of lose of information due to transient keyword.
  - For transient variables, it does not store value in the file while Serialization 
  	then while Deserialization, we are not able to retrieve value of transient variable from object
  	as its not stored in the file.
  - such a way, we loss data due to transient keyword.
  -	We can recover this loss of information by using customized serialization.
  -	We can implements customized serialization by using the following two methods.
  //use while write
  1.private void writeObject(ObjectOutputStream os) throws Exception
  	- This method will be executed automatically by jvm at the time of serialization.
  	- It is a callback method.
  	- Hence at the time of serialization if we want to perform any extra work 
  	  we have to define that in this method only.
  
  //use while read
  2.private void readObject(ObjectInputStream is) throws Exception.
  	- This method will be executed automatically by JVM at the time of Deserialization.
  	- Hence at the time of Deserialization if we want to perform any extra activity 
  	  we have to define that in this method only.
 
  -	At the time of Account object serialization JVM will check is there any writeObject() 
	method in Account class or not.
  -	If it is not available then JVM is responsible to perform serialization(default serialization). 
  -	If Account class contains writeObject() method then JVM executes that Account class writeObject() method. 
  -	The same rule is applicable for readObject() method also.
  
*/

class Account implements Serializable {
	String user = "Rasika";
	String password = "Swapnil";

	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		String modifyPassword = 123 + password;
		oos.writeObject(modifyPassword);
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		String modifyPassword = (String) ois.readObject();
		password = modifyPassword.substring(3);
	}
}


public class CustomizedSerialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		try(FileOutputStream fileOutputStream = new FileOutputStream("xyz.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			FileInputStream fileInputStream = new FileInputStream("xyz.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
			Account a1=new Account();
			System.out.println(a1.user+"........."+a1.password);
			
			System.out.println("Serialization started.");
			objectOutputStream.writeObject(a1);
			System.out.println("Serialization done.");
			
			System.out.println("Deserialization started.");
			Account a2 = (Account) objectInputStream.readObject();
			System.out.println(a2.user+"........."+a2.password);
		}
	}

}
