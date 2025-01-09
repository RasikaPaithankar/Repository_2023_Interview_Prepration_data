package com.java.practice;


/*
 * What is Race Condition?
 * - 2 threads trying to access one resources, and output will be inconsistent. 
 * 
 * e.g.,
 * both thread trying to use same method increment, when thread 1 increment by 1 and same time thread 2 also trying to
 * increment it to 1 but already thread1 has increment by 1 hence thread 2 will skip 1 and increment it to 2.
 * 
 * such a way we loss some increments.
 * 
 * if we use keyword synchronized with increment method, at a time only one thread can access it.
*/
public class RaceConditionExample {

	int count;
	
	//without Synchronized, Race condition will occurs.
	public void increment() {
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
