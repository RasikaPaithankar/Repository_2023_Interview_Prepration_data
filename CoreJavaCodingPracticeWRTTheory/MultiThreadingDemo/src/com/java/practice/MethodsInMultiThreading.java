package com.java.practice;

/*
 * Methods to prevent execution of Thread
 * 
 * 1. yield();
 * 2. join();
 * 3. sleep();
 * 
 * Methods to interrupt execution of Thread
 * 
 * 1. interrupt();
 * 
 * methods to stop execution of Thread
 * 
 * 1. stop();
 * 2. destroy();
 *  
 * 
*/

/*
 * A. Methods to prevent execution of Thread
 * 
 * 1. yield() -> 
 * 	-it causes to stop execution of current thread for giving chance to another waiting thread with same priority.
 * 	-if all waiting thread with less priority or no waiting threads then the same Thread will be continued its execution.
 * 	-the thread which is yielded when get it chance for execution once again is depends on the JVM.
 * 
 *  e.g., Thread.yeild();
 *  
 *  Running -> ready/Runnable
 *  
 *  
 * 2. join() ->
 * 	-if a thread wants to wait until completing some other thread, then we should go for join() method.
 * 	-Every join() method throws InterruptedException, which is checked exception hence compulsory 
 * 	 we should handle either by try catch or by throws keyword.
 * 	
 * Running -> waiting state -> ready/Runnable
 * 
 * 	e.g.,
 * 	Thread t1 = new Thread();
 * 	Thread t2 = new Thread();
 * 
 * 	t1.join();
 * 	t2.join();
 * 
 * 
 * 3. sleep() ->
 * 	-if we don't want to perform any operation for a particular amount of time, then we can use sleep() method.
 * 	-Running -> sleeping state -> Ready/Runnable
 * 
*/

class T1 extends Thread{
	
	public void run() 
	{
		for(int i=0; i<=10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			System.out.println("T1 Thread");
		}
	}
}

class T2 extends Thread {
	
	public void run()
	{
		for(int i=0; i<=10; i++) {
			System.out.println("T2 Thread");
		}
	}
}

/*B. Methods to interrupt execution of Thread
 * 
 *	-if a Thread can interrupt a sleeping or waiting Thread by using interrupt()method of Thread class.
 *	
 * #Note - 
 * 	1. Whenever we are calling interrupt() method, we may not see effect immediately, 
 * 	-  If the target thread is in waiting state or sleeping state, then it will be interrupted immediately.
 * 	-  If the target thread is not in sleeping or waiting state, then interrupt() method call will wait until
 * 	   target thread goes into waiting or sleeping state.
 * 	-  Once target thread goes into waiting or sleeping state, interrupt method will effect immediately.
 * 	-  If target thread never entered into waiting or sleeping state then there is no impact of interrupt() method. 
 *
*/

class T3 extends Thread {
	public void run() {
		try {
			for(int i=0;i<=10;i++) {
				System.out.println("Thread3 value is "+ i);
				if(i==5) {
					Thread.sleep(2);
				}
			}
		} catch (InterruptedException i) {
			System.out.println("I am interrupted.");
		}
	}
}

/*
 * C. methods to stop execution of Thread
 * 	1. stop()
 * 	2. destroy()
 * 
 * 1. stop() -> 
 * 	-The stop() method of thread class terminates the thread execution.
 * 	-Once a thread is stopped, it cannot be restarted by start() method.
 * 
 * 
 * 2. destroy() ->
 * 	-used to destroy the thread group and all of its subgroups.
 * 	-The thread group must be empty, indicating that all threads that had been in the thread group have since stopped.
 * 
 */
class T4 extends Thread {
	
	public void run() {
		for(int i=0; i<=10; i++) 
		{
			System.out.println("T4 Thread");
		}
	}
}


/*
 * ThreadGroup
 * A thread group represents a set of threads. 
 * In addition, a thread group can also include other thread groups.
 * The thread groups form a tree in which every thread group except the initial thread group has a parent.
 * <p>
 * A thread is allowed to access information about its own thread group.
 * but not to access information about its thread group's parent thread group or any other thread groups.
 * 
 */

class OwnThreadGroup extends Thread {
	public OwnThreadGroup(ThreadGroup group, String name) {
		super(group, name);
	}
	
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println("Own Thread Group");
		}
		  System.out.println(Thread.currentThread().getName() + " finished executing");  
	}
}

public class MethodsInMultiThreading {

	public static void main(String[] args) throws InterruptedException {
		T1 t1 = new T1();
		T2 t2 = new T2();
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		T3 t3 = new T3();
		t3.start();
		
		t3.interrupt();
		
		T4 t4 = new T4();
		t4.start();
		t4.stop();
		
		for(int l=0; l<=5; l++) {
			System.out.println("main thread");
		}
		
		ThreadGroup group = new ThreadGroup("Parent thread");
		ThreadGroup group1 = new ThreadGroup(group, "Child thread");
		
		OwnThreadGroup ownThreadGroup = new OwnThreadGroup(group, "OwnThreadGroup");
		OwnThreadGroup ownThreadGroup1 = new OwnThreadGroup(group1, "OwnThreadGroup1");
		
		ownThreadGroup.start();
		ownThreadGroup1.start();
		
		ownThreadGroup.join();
		ownThreadGroup1.join();
		
		group1.destroy();
		System.out.println(group1.getName() + "is destroyed.");
		
		group.destroy();
		System.out.println(group.getName() + "is destroyed.");
	}

}


/*
 * Other methods
 * 1. currentThread() -> It returns a reference to the currently executing thread object.
 * 
 * 2. getName() -> It returns the name of the thread.
 * 
 * 3. setName() -> It changes the name of the thread.
 * 
 * 4. isAlive() -> It tests if the thread is alive.
 * 
 * 5. suspend() -> It is used to suspend the thread.
 * 
 * 6. resume() -> It is used to resume the suspended thread.
 * 
 * 7. isDaemon() -> It tests if the thread is a daemon thread.
 * 
 * 8. setDaemon() -> It marks the thread as daemon or user thread.
 * 
 * 9. isinterrupted() -> It tests whether the thread has been interrupted.
 * 
 * 10. interrupted() -> It tests whether the current thread has been interrupted.
 * 
 * 11. activeCount() -> It returns the number of active threads in the current thread's thread group.
 * 
 * 12. enumerate() -> It is used to copy every active thread's thread group and its subgroup into the specified array.
 * 
 * 13. notify() -> It is used to give the notification for only one thread which is waiting for a particular object.
 * 
 * 14. notifyAll() -> It is used to give the notification to all waiting threads of a particular object.
 */