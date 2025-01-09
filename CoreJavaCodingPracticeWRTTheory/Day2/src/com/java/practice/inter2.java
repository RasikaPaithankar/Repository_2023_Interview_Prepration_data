package com.java.practice;

public interface inter2 {
	public static final int i = 100;
	
	public int methodOne(int i);
	
	public default void m2() {
		System.out.println("Test");
	}
}
