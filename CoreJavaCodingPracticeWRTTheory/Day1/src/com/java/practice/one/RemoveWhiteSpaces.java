package com.java.practice.one;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String s = "   abc efyu enkwe  \t";
		s=s.strip();
		System.out.println(s);
		
		String s1 = "  xyd nmsaj hbsad  \t";
		s1 = s1.trim();
		System.out.println(s1);
	}

}
