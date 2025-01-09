package com.java.practice.one;

public class SortArrayWithoutMethod {

	public static void sortArr(int[] arr) {
		int min = 0;
		
		for(int i = 0; i< arr.length; i++) 
		{
			for(int j = i+1; j<arr.length; j++) 
			{
				if(arr[j] < arr[i]) 
				{
					min = arr[j];
					arr[j] = arr[i];
					arr[i] = min;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {52,45,32,64,12,87,78,98,23,7};
//		System.out.println(arr.length);
		sortArr(arr);
	}

}
