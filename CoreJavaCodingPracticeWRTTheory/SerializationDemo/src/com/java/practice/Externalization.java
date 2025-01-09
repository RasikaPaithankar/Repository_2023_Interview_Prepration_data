package com.java.practice;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


/*	
  *	Externalization : ( 1.1 v )
  
  - In default serialization every thing takes care by JVM and programmer doesn't have any control.
  -	In serialization total object will be saved always and it is not possible to save part of the object.
  - To overcome these problems we should go for externalization where every thing takes care by programmer.
  -	To provide Externalizable ability for any object compulsory the corresponding class should 
  	implements externalizable interface.
  - Externalizable interface is child interface of serializable interface.
  
  
  
  *	Externalizable interface defines 2 methods
  
  -	1. public void writeExternal(ObjectOutput oo) throws IOException
  	 - This method will be executed automaticcay at the time of Serialization.
  	 - With in this method , we have to write code to save required variables to the file.
  	   
  - 2. public void readExternal(ObjectInput oi) throws IOException
  	 - This method will be executed automatically at the time of deserialization.
  	 - with in this method , we have to write code to save read required variable from file 
  	   and assign to the current object.
  	   
  	   
  -	At the time of deserialization Jvm will create a seperate new object by executing public
	no-arg constructor on that object JVM will call readExternal() method.
  -	Every Externalizable class should compusory contains public no-arg constructor
	otherwise we will get RuntimeExcepion saying "InvaidClassException" .
  - In externalization transient keyword won't play any role , hence transient keyword not required. 

*/

class Data implements Externalizable {
	
	String s;
	int i;
	int j;
	
	
	public Data() {
		System.out.println("Default constructor");
	}
	
	public Data (String s, int i, int j) {
		this.s = s;
		this.i = i;
		this.j = j;
	}
	
	@Override 
	public void writeExternal(ObjectOutput oo) throws IOException {
		oo.writeObject(s);
		oo.writeInt(i);
	}
	
	@Override 
	public void readExternal(ObjectInput oi) throws ClassNotFoundException, IOException {
		s = (String) oi.readObject();
		i = oi.readInt();
		
	}
}

public class Externalization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		try(FileOutputStream fos = new FileOutputStream("Data.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			FileInputStream fis = new FileInputStream("Data.txt");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Data data = new Data("I am a String",1,2);
			System.out.println(data.s+"...."+data.i+"...."+data.j);
			oos.writeObject(data);
			System.out.println("Externalization done.");
			
			Data data1 = (Data) ois.readObject();
			System.out.println(data1.s+"...."+data1.i+"...."+data1.j);
		}
	}

}
