package com.java.practice.one;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Str";
		System.out.println("String is "+ s);
		StringBuilder sb = new StringBuilder();
		char ch[] = s.toCharArray();
		
		for(int i=s.length()-1; i >= 0; i--) {
			sb.append(ch[i]);
		}
		System.out.println("Reverse string is " + sb);
		
	}

}
