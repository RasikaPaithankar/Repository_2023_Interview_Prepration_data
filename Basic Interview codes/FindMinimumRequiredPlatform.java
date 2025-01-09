package com.test;

import java.util.Arrays;

public class FindMinimumRequiredPlatform {

	public static void main(String[] args) {
		int arr[] = {100, 140, 150, 200, 215, 400};
        int dep[] = {110, 300, 210, 230,315, 600};

		findPlatformsRequiredForStation(arr, dep);		
	}

	private static void findPlatformsRequiredForStation(int[] arr, int[] dep) {
		
		int platformRequired = 0, MaxPlatform = 0;
		Arrays.sort(arr);
		Arrays.sort(dep);
		int i = 0, j =0;
		while(i < arr.length && j < dep.length) 
		{
			if(arr[i] < dep[j]) 
			{
				platformRequired++;
				i++;
				if(platformRequired > MaxPlatform) 
				{
					MaxPlatform = platformRequired;
				}
			} else 
			{
				platformRequired--;
				j++;
			}
		}
		System.out.println(MaxPlatform);
	}

}
