package com.test;

public class FindLargestAndSmallestNumber {

	public static void main(String[] args) {
		int[] arr = {12,56,76,89,6,100,343,21,234};
		
		int smallest = arr[0];
		int largest = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < smallest ) {
				smallest = arr[i];
			} else if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		
		System.out.println("Smallest " + smallest + " " + "Largest " + largest);
	}

}
