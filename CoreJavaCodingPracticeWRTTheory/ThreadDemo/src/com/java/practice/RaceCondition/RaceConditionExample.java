package com.java.practice.RaceCondition;

public class RaceConditionExample {

	int count;
	public synchronized void increment() {
		count++;
	}
	
	public static void main(String[] args) throws InterruptedException {
		RaceConditionExample f = new RaceConditionExample();
		
		Runnable runnable1 = () -> {
			for(int i=1; i<=1000; i++) {
				f.increment();
			}
		};
		
		Runnable runnable2 = () -> {
			for(int i=1; i<=1000; i++) {
				f.increment();
			}
		};
		
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		
		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();
		
		System.out.println(f.count);
	}

}
