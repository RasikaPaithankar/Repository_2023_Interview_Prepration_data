package com.test;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Reverse";
		StringBuilder sb = new StringBuilder(str);
		
		// using StringBuilder
		sb = sb.reverse(); 
		System.out.println(sb);
		System.out.println(str);
		
		// Using char at method
		String s = "ReverseMeUsingCharAtMethod";
		String r = "" ;
		for(int i = s.length() - 1; i >= 0 ; i-- ) {
			r = r + s.charAt(i);
		}		
		System.out.println(r);
		
		//Using toCharArray() array
		
		String s1 = "Hello";
		char c[] = s1.toCharArray();
		System.out.println(c.length);
		String rs = "";
		for(int k = c.length - 1; k >= 0 ; k--) {
			rs = rs + c[k];
		}
		
		System.out.println(rs);
		
		// Using Recursion 
		String sr = "Test";
		
		String reverse = reverseString(sr);
		System.out.println("Recursion reverse "+ sr);
		System.out.println("Recursion reverse "+ reverse);
	}
	
		public static String reverseString(String sr) {
			if(sr.length() == 1) {
				return sr;
			} else 
				return  sr.charAt(sr.length()-1) +  reverseString(sr.substring(0,sr.length() -1 ));
		}
}
