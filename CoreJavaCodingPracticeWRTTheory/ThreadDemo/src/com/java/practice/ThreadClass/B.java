package com.java.practice.ThreadClass;

public class B extends Thread{
	
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
