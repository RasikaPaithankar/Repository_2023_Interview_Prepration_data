package com.java.practice.ThreadClass;

public class A extends Thread {

	
	public void run(){
		for(int i=0; i<=50; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.start();
		
		B b = new B();
		b.start();
	}

	

}
