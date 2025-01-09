package com.java.practice;

/*
 * Synchronized
 * 
 * - Synchronized is the keyword applicable for methods and blocks (it does not applicable to classes or variables).
 * - If a method or block declared as the synchronized then at a time only one Thread is allow to execute that method or block on given object.
 * - Advantage 
 * 		1. resolve inconsistency problem
 * - Disadvantage
 * 		1. increase waiting time of thread which effects the performance.
 * - Internally synchronization concept is implemented by using lock concept.
 * - If a Thread wants to execute any synchronized method on the given object 1st it has to get the lock of that object.
 * - Once a Thread got the lock of that object then it's allow to execute any synchronized method on that object.
 * - If the synchronized method execution completes then automatically Thread releases lock.
 * 
 * 
 * There are two types of thread synchronization mutual exclusive and inter-thread communication.
 * A. Mutual Exclusive
 * 		1. Synchronized method.
 * 		2. Static synchronization.
 * 		3. Synchronized block.
 * B. Cooperation (Inter-thread communication in java)
 * 		1. wait()
 * 		2. notify()
 * 		3. notifyAll()
 * 
*/

// A. Mutual Exclusive

class Dispaly {
/*
 * 1. Synchronized method
 * 
 * - If a Thread wants to execute any synchronized method on the given object 1st it has to get the lock of that object.
 * - Once a Thread got the lock of that object then it's allow to execute any synchronized method on that object.
 * - If the synchronized method execution completes then automatically Thread releases lock.
 * - While a Thread executing any synchronized method the remaining Threads are not allowed execute any synchronized method on that 
 * 	 object simultaneously.
 * - But remaining Threads are allowed to execute any non-synchronized method simultaneously.
 */	
	// non-static method
	public synchronized void wish(String name) {
		for(int i=0; i<=10; i++) {
			System.out.print("Hello :");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
	
/*
 *  2. Static synchronization
 *   
 *  - Every java class has unique lock.
 *  - If a Thread wants to execute a static synchronized method then it required class level lock.
 *  - Once a Thread got class level lock then it is allow to execute any static synchronized method of that class.
 *  - While a Thread executing any static synchronized method the remaining Threads are not allow to execute any static synchronized method of
 *    that class simultaneously.
 *  - But remaining Threads are allowed to execute normal synchronized methods,normal static methods, and normal instance methods simultaneously.
 *  
 */	
	// static synchronized method
	public static synchronized void Test2() {
		for(int i=0;i<=10;i++) {
			System.out.println("Test method has Static Synchronization.");
		}
	}
	
/*
 * 3. Synchronized block
 * 
 * 	- If very few lines of the code required synchronization then it's never recommended to declare entire method as synchronized 
 * 	  we have to enclose those few lines of the code with in synchronized block.
 * 	- The main advantage of synchronized block over synchronized method is it reduces waiting time of Thread 
 * 	  and improves performance of the system.
 * 
 * 	e.g., 
 * 1. Synchronized(this){} -> If Thread got lock of current object then only it is allowed to execute this block.
 * 2. Synchronized(b){}  ->	If thread got lock of 'b' object then only it is allowed to execute this block.
 * 3. Synchronized(Display.class){} -> If thread got class level lock of Display then only it allowed to execute this block.
 * 
 * 
 * Note -
 * 	we can not pass primitive type value as a argument to the synchronized block as lock is dependent on the object or class.
 * 	hence we can pass object reference or .class
 *  	
 */	
//	Synchronized block 
	public void Test() {
		synchronized(this){			// Synchronized block
			for(int i=0;i<=10;i++) {
				System.out.println("Test method has Synchronized block.");
			}
		}
	}

	
}

// B. Cooperation (Inter-thread communication in java)
/*
 * 	- Two Threads can communicate with each other by using wait(), notify() and notifyAll() methods.
 * 	- The Thread which is required updation it has to call wait() method on the required object.
 * 	- After calling wait() method on object, it immediately goes into waiting state.
 * 	- Again when thread perform thread update (waiting state to ready state), 
 * 	  it is responsible to give notification by calling notify() method.
 * 	- After getting notification the waiting thread will get those updation
 * 	  (Will go into ready/Runnable state and will wait until get resources.)
 *   
 *   
 *   -	wait(), notify() and notifyAll() methods are available in Object class but not in Thread class 
 *   	because Thread can call these methods on any common object.
 *   -	To call wait(), notify() and notifyAll() methods compulsory the current Thread should be owner of that object.
 *   -	Current Thread should be in synchronized area.
 *   	Hence we can call wait(), notify() and notifyAll() methods only from synchronized area
 *   	otherwise we will get runtime exception saying IllegalMonitorStateException.
 *   -	Once wait() method call on a object, it releases the lock on that object and then goes into waiting state.
 *   -	Once a Thread call notify() or notifyAll() method, it releases the lock of that object but may be not immediately.
 *   	  
 */

class ThreadB extends Thread {
	int total;
	public void run() {
// if this block is not declare, i.e., we don't have a lock on object
// then we will get exception "java.lang.IllegalMonitorStateException: current thread is not owner"		
		synchronized(this) {
			System.out.println("child thread starts calcuation");
			for(int i=0;i<=10;i++) {
				total = total+1;
			}
			System.out.println("child thread giving notification call");
			this.notify();
		}
	}
}


class CustomThread extends Thread {
	Dispaly d;
	String name;
	
	public CustomThread(Dispaly d,String name) {
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
}

public class SynchronizedExample {

	public static void main(String[] args) throws InterruptedException {
		
// case 1 : one display object.
// here we have only one display object, on which we are got a lock at a once
// hence we got consistent output.		
		Dispaly dispaly = new Dispaly();	// object on which we got lock.
		CustomThread customThread = new CustomThread(dispaly, "Rasika");
		CustomThread customThread1 = new CustomThread(dispaly, "Swapnil");
		//customThread.start();
		//customThread1.start();
		
		
// case 2 : two different display object.
// 	- Even though we declared wish() method as synchronized but we will get irregular output in this case,
//	  because both Threads are operating on different objects. 		
		Dispaly dispaly2 = new Dispaly();
		Dispaly dispaly3 = new Dispaly();
		CustomThread customThread2 = new CustomThread(dispaly2, "Rasika 1");
		CustomThread customThread3 = new CustomThread(dispaly3, "Swapnil 1");
		customThread2.start();
		customThread3.start();
		
	
// wait() and notify() example
		
		ThreadB b = new ThreadB();
		b.start();
		
// if this block is not declare, i.e., we don't have a lock on object
// then we will get exception "java.lang.IllegalMonitorStateException: current thread is not owner"		
		synchronized (b) {
			System.out.println("main Thread calling wait() method");
			b.wait();
			System.out.println("b Thread send notification call");
			System.out.println(b.total);
		}
	}
}


// notify() vs notifyAll()

/*	//notify()
 * 
 * 1. We can use notify() method to give notification for only one Thread 
 * 2. if we have multiple threads which are in waiting state 
 * 	  and by calling notify() only one thread will get chance 
 * 	  and other threads will be in the waiting state only. 
 * 3. and remaining Threads has to wait for further notification.
 * 4. But which Thread will be notify(inform) we can't expect exactly it depends on JVM.
 * 
 * 
 * 	//notifyAll()
 * 
 * 1. We can use notifyAll() method to give the notification for all waiting Threads.
 * 2. All waiting Threads will be notified and will be executed one by one, 
 * 	  because they are required lock.
 * 
 */
