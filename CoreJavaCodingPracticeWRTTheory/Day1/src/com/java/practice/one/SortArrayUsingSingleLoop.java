package com.java.practice.one;

public class SortArrayUsingSingleLoop {

	public static void sortArr(int[] arr) {
		int min=0;
		for(int i = 0; i<arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				min = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = min;
				i = -1;
			}
		}
		for (int i : arr) {
			System.out.print(i +" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {121,212,25,63,332,2};
		sortArr(arr);
	}

}
