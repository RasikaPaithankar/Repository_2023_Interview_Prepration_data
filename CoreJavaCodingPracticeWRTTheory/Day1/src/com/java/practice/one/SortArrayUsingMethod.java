package com.java.practice.one;

import java.util.Arrays;

public class SortArrayUsingMethod {

	public static void main(String[] args) {
		int[] arr = {-1,2,5,2,4,3,-2,-6};
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
