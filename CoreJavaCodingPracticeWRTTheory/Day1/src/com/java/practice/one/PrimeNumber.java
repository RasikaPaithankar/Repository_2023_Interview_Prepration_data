package com.java.practice.one;

public class PrimeNumber {

	public static boolean isPrimeNumber(int i) {
		if(i == 0 || i == 1) {
			return false;
		} else if (i == 2){
			return true;
		} else {
			for(int j = 2; j <= i/2; j++) {
				if( i%j == 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPrimeNumber(23));
		System.out.println(isPrimeNumber(1));
		System.out.println(isPrimeNumber(2));
		System.out.println(isPrimeNumber(49));
	}

}
