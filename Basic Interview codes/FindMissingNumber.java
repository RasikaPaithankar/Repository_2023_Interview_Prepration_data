package com.test;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] arr = {7,5,6,1,4,2};
		int missingNum = findMissingNum(arr);
		System.out.println(missingNum);
	}

	private static int findMissingNum(int[] arr) {
		int n = arr.length;
		int sum = n*(n+1) / 2;
		int arrSum = 0;
		for(int i = 0; i < arr.length ; i++) 
		{
			arrSum += arr[i];
		}
		int result = arrSum - sum;
		return result;
	}

}
