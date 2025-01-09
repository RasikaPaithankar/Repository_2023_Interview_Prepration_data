package com.java.practice;

/*
 * Executing several tasks simultaneously is the concept of multitasking. 
 * There are two types of multitasking's.
 * 	1.	Process based multitasking
 * 	2. 	Thread based multitasking.
 * 
 * main objective of multitasking is to improve performance of the system by reducing response time.
 * 
 * 1. Process based multitasking
 * 		- executing several tasks simultaneously
 * 		- where each task is a separate independent process
 * 		- such type of multitasking is known as "Process based multitasking"
 * 
 * 2. Thread based multitasking
 * 		- Executing several tasks simultaneously
 * 		- each task belongs to same program but treat as a separate tasks.[all these tasks belongs to one process.]
 * 		- is called Thread based multitasking
 * 
 * We can define a Thread in the following 2 ways
 * 	1. By implementing Thread class
 * 	2. By implementing Runnable interface.
 * 
 * JVM decides which thread should execute.
 * 
 * 
*/

class CustomThread1 extends Thread {
	
/*
 * run() 
 * Override run method of Thread class to provide implementation. 
 * If we don't provide there will be no output as Thread class method has empty implementation. 
 * Overloading run() method - we can overload run() method, 
 * but start() method always invoke no argument run() method.
 */	
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("Thread 1");
		}
	}
	
/*
 *  start()
 *  we can override the start method then our start() method will be executed just like a normal 
 *  method call and no new Thread will be started. 
 *  
 *  It is never recommended to override start() method.
 */	
	
}

public class MultiThreading {

	public static void main(String args[]) 
	{
		CustomThread1 customThread1 = new CustomThread1();

/*
 * run() 
 * 	- no new thread will create when we call run method.
 * 	- 
 */		
		customThread1.run();

// set and get name of thread 				
		customThread1.setName("Thread 1");
		System.out.println("Thread name is"+ customThread1.getName());
		
// set and get priority of thread
//		1 -	MIN_PRIORITY
//		5 - NORN_PRIORITY
//	   10 - MAX_PRIORITY
		System.out.println(customThread1.getPriority());	// by default NORM_PRIORITY
		customThread1.setPriority(10);						// MAX_PRIORITY
		System.out.println(customThread1.getPriority());	// Set MAX_PRIORITY

/*
 * start() 
 * 	- new thread will be created when we call start method. new thread will be responsible to execute run method.
 * 	- start method is responsible to register a thread with thread scheduler 
 * 
 * After starting a Thread we are not allowed to restart the same Thread once again 
 * otherwise we will get runtime exception saying "IllegalThreadStateException". 
 */
		customThread1.start();
		
		for(int i=0; i<=5 ;i++) {
			System.out.println("Main thread.");
		}
		
		customThread1.start();
		
		CustomThread2 customThread2 = new CustomThread2();
		customThread2.run();
		
		Thread thread = new Thread(customThread2);
		thread.start();
		
	}
}

/*
 * We can define a Thread even by implementing Runnable interface also. 
 * Runnable interface present in java.lang package and contains only one method run().
 * it is a functional interface.
 */
class CustomThread2 implements Runnable {

	@Override
	public void run() {
		for(int j=0;j<=10; j++) {
			System.out.println("Thread 2");
		}
	}
	
}


// implement multi-threading using lambda expression using functional interface ( Runnable interface)

class MyThread {
	public static void main(String args[]) {
		Runnable runnable = () -> {
			for(int k=0; k<=10;k++) {
				System.out.println("My Thread");
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
	}
}



/*
 *  life cycle of Thread 
 *  
 *  new state/new born -> Ready/Runnable -> Running -> dead. 
 * 	
 * 	new state -> 		Once we create a thread, it said to be new state or new born.
 * 	Ready/Runnable -> 	Once we call start() method, then thread goes into Ready or Runnable state.
 * 	Running ->			If Thread Scheduler allocates CPU to a thread, then thread will be entered into Running state.
 * 	dead	-> 			when run() method completes, then thread will entered into dead state.
 * 
 */