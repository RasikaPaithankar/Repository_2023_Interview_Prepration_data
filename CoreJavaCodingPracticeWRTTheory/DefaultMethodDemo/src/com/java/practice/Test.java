package com.java.practice;

public class Test implements DemoClass, DemoClass2{

	@Override
	public void m1() {
		DemoClass.super.m1();
	}

}
