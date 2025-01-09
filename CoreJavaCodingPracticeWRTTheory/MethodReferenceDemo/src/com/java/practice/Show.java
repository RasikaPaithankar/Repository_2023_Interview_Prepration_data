package com.java.practice;

public class Show {
	
	public void showMyData(int i) {
		System.out.println("Show data " + i);
	}
	
	public static void printData(String s) {
		System.out.println("String is "+ s);
	}
	
	
	public static void main(String[] args) {
		Show shown = new Show();
		A a = shown::showMyData;
		a.display(10);
		
		B b = Show::printData;
		b.print("immutable");
		
		
	}

}
