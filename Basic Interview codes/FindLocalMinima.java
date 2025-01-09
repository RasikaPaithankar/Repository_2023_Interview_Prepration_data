package com.test;

public class FindLocalMinima {

	public static void main(String[] args) {
		int [] arr = {10, 5, 3, 6, 13, 16, 7};
		findLocalMinimaNumber(arr);
	}

	private static void findLocalMinimaNumber(int[] arr) 
	{
		int localMinima = arr[0];
		for(int i = 1; i< arr.length -1; i++)
		{
			if(arr[i] < localMinima)
			{
				localMinima = arr[i];
			}
		}
		
		System.out.println(localMinima);
	}

}
