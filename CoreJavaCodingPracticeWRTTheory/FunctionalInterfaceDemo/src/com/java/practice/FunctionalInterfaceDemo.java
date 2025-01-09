package com.java.practice;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
			
		Demo d2 = () -> {
			System.out.println("Calling abstract method ");
		};
		d2.m1();
		d2.m3();
		Demo.m4();
		AInt.m4();
	}		
}

