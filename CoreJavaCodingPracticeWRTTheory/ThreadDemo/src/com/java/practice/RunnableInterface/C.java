package com.java.practice.RunnableInterface;

public class C implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<=50; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		C c = new C();
		D d = new D();
		
		Thread thread1 = new Thread(c);
		Thread thread2 = new Thread(d);
		
		thread1.start();
		thread2.start();
		
	}

}
