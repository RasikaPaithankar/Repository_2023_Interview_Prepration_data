package com.test;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		int[] arr = {7,5,6,1,4,2};
		int secondLargest = FindSecondLargestNum(arr);
		System.out.println(secondLargest);
	}

	private static int FindSecondLargestNum(int[] arr) {
		int largest = 0;
		int secondLargest = 0;
		for(int i = 0; i < arr.length; i++) 
		{
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if(arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
			
		}
		return secondLargest;
	}

}
