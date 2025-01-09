package com.java.practice.one;

public class RecusionFebSeq {
	
	static int a=0;
	static int b=1;
	static int c;
	public static void fibSeq(int n){
		if(n>=1) {
			c = a+b;
			System.out.print(c + " ");
			a = b;
			b = c;
			fibSeq(n-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.print(a +" "+ b + " ");
		fibSeq(5);
	}

}
