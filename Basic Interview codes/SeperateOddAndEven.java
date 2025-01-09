package com.test;

public class SeperateOddAndEven {

	public static void main(String[] args) {
		int arr[] = {12, 17, 70, 15, 22, 65, 21, 90};
		seperateOddAndEvenNumber(arr);
	}
	
	private static void seperateOddAndEvenNumber(int[] arr) 
	{
			int start = 0;
			int end = arr.length -1;
			int temp =0;
			
			for(int i = 0; i < arr.length-1; i++ ) 
			{
				while(arr[start] % 2 == 0) 
				{
					start++;
				}
				
				while (arr[end] % 2 == 1)
				{
					end--;
				}
				
				if(start < end) 
				{
					temp = arr[start];
					arr[start] = arr[end];
					arr[end] = temp;
				} 

			}	
			
			for (int i : arr) {
				System.out.print(i + " ");
			}
	}
}
