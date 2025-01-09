package com.java.practice.one;

public class Palindrome {
	
	public static boolean isPalindrome(String s) {
		boolean flag = true;
		System.out.println(s.length());
		for(int i = 0; i < s.length()/2; i++) 
		{
			if(s.charAt(i) != s.charAt(s.length() - i -1)) 
			{
				flag = false;
				break;
			}
		}
		
		return flag;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("123321"));
	}

}
