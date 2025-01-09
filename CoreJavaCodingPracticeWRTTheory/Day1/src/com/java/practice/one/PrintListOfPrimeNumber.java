package com.java.practice.one;

public class PrintListOfPrimeNumber {
	public static void printListofPrimeNumbers(int min, int max) {
		String flag = "not prime";
		for (int i = min; i <= max; i++) {
			if (i == 0 && i == 1) {
				continue;
			}
			if (i == 2) {
				System.out.println(i);
				continue;
			}
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = "not prime";
					break;
				} else {
					flag = "Prime";
				}
			}
			if (flag.equalsIgnoreCase("Prime")) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		printListofPrimeNumbers(1, 50);
	}

}
