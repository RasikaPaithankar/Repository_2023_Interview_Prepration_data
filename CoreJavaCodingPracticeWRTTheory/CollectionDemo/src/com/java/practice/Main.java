package com.java.practice;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		System.out.println(main.fun());
	}
	
	int fun(){
		final int a = 20;
		final int b = 30;
		if(a<b) 
		{
			return a;
		} else 
		{
			return b;
		}
		
	}

}
