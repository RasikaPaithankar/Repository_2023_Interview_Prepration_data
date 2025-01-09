package com.test;

public class FindMaxInSlidingWindow {

	public static void main(String[] args) {
		int arr[] = {2,6,-1,2,4,1,-6,5};
		int k = 3;
// 		approach 1		
		findMaxNumberInSlidingWindow(arr, k);
		System.out.println( " ");
		
// 		approach 2
		approach2(arr,k);
		
	}

	private static void approach2(int[] arr, int k) {
		for(int i = k; i <= arr.length; i++) 
		{
			int max = Integer.MIN_VALUE;
			for(int j = i-k; j < i ; j++) 
			{
				max = Math.max(max, arr[j]);
			}
		System.out.print(max + " ");
		}
	}

	private static void findMaxNumberInSlidingWindow(int[] arr, int k) {
		try 
		{
			for(int i = 0; i < arr.length - 1; i++ ) {
				int max = 0;
				for(int j =i; j < i+k; j++)
				{
					if(arr[j] > max) 
					{
						max = arr[j];
					}
				}
				System.out.print(max + " ");
			}
		} catch (Exception e) {
			
		}
	}
}
