package com.java.practice;

public class RemoveSpacefromString {

	public static void main(String[] args) {
		String s = "Java is Best.";
				
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i <= s.length()-1; i++) 
		{
			char ch = s.charAt(i);
			if(ch != ' ') {
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}

}
