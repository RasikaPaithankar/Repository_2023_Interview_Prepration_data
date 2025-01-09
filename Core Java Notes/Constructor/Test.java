package com.java.practice;

class X{
	public X() {
		System.out.println("X");
	}
}

class Y extends X {
	public Y() {
		super();
		System.out.println("Y");
	}
}

class Z extends Y{
	int a;
	static int x;
//	final int n;  		final variable should initialize as compiler don't provide default value to it.
	public Z() {
		super();
		System.out.println("Z");
	}
}

public class Test {

	public static void main(String[] args) {
		Z z = new Z();
		System.out.println(z.x);
	}

}
