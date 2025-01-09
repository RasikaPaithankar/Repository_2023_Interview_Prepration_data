package com.test;

public class SeperateBits {

	public static void main(String[] args) {
		int[] arr = new int[]{0,1,0,0,1,1,1,0,1};
		
		// approach 1
//		seperate0sAnd1s(arr);
		// approach 2
//		seperate0sAnd1sUsingCount(arr);
		// approach 3
		seperate0sAnd1sUsingTwoPointers(arr);
		
	}

	private static void seperate0sAnd1sUsingTwoPointers(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		for(int i = 0; i < arr.length; i++)
		{
			while(arr[start] == 0)
			{
				start++;
			}
			while(arr[end] == 1) 
			{
				end--;
			}
			
			if(start < end)
			{
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void seperate0sAnd1sUsingCount(int[] arr) 
	{
		int count = 0;
		for(int i= 0; i< arr.length ; i++) 
		{
			if(arr[i] == 0) 
			{
				count++;
			}
		}
		
		for(int i=0; i< count; i++) 
		{
			arr[i] = 0;
		} 
		
		for(int i = count; i< arr.length; i++)
		{
			arr[i] = 1;
		}
		
		for (int m : arr) {
			
			System.out.print(m + " ");
		}
	}

	private static void seperate0sAnd1s(int[] arr) {
		
		for(int i = 0; i < arr.length ; i++ ) 
		{
			int k = 0;
			for(int j = 1; j< arr.length; j++) 
			{
				if(arr[j] != 0) 
				{
					k = j;
					continue;
				} else 
				{
					arr[j] = arr[k];
					arr[k] = 0; 
				}
			}
		}
		
		for (int m : arr) {
			
			System.out.print(m + " ");
		}
	}

}
