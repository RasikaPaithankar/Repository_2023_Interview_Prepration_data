package com.java.practice.UsingFunctionalnterface;

public class E {

	public static void main(String[] args) {
		Runnable runnable1 = () -> 
		{
			for (int i = 0; i <= 5; i++) 
			{
				System.out.println("Hi");
				try 
				{
					Thread.sleep(100);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		};
		
		
		Runnable runnable2 = () -> 
		{
			for (int i = 0; i <= 5; i++) 
			{
				System.out.println("Hello");
				try 
				{
					Thread.sleep(100);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		};
		
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		
		thread1.start();
		thread2.start();
		
	}

}
