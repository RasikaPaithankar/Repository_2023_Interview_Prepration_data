package com.test.patterns;

public class Parent {
	
	public static void main(String[] args) {
		child c = new child();
		c.m1();
	}
}

class Parent1{
	int i;
}

class child extends Parent1{
	int j;
	
	public void m1() {
		i = 10;
		j = 20;
		System.out.println(i+j);
	}
}