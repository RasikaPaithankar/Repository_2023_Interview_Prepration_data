package com.java.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
1. 	Rule 
	The allowed characters are: 
	1. a to z, A to Z, 0 to 9, -,#
	2. The 1st character should be alphabet symbol only.
	3. The length of the identifier should be at least 2.
	
	Answer -> [a-zA-Z][a-zA-Z0-9-#]{2,}
	
2. Write a regular expression to represent all mobile numbers.
	1. Should contain exactly 10 digits.
	2. The 1st digit should be 7 to 9.	
	3. it might start with 0 or 91
	
	Answer -> (0|91)?[7-9][0-9]{9}
	
3. Write a regular expression to represent all Mail Id's. 
	
	Answer -> [a-zA-Z][a-zA-Z0-9.-]*@gmail[.]com
	
4. 	Rule
	1. The length of the identifier should be at least two.
	2. The allowed characters are 
		a-z
		A-Z
		0-9
		#
		$
	3. The first character should be lower case alphabet symbol k-z , 
		and second character should be a digit divisible by 3
	
	Answer -> [k-z][0369][a-zA-Z0-9#$]{2,}



5. Write a regular expressions to represent all names starts with 'a' 
	
	Answer -> [aA][a-zA-Z]*

6. To represent all names starts with 'A' ends with 'K' 

	Answer -> [aA][a-zA-Z]*[kK]
	
*/
class demo {
	String s = "a";
	public void m1() {
		Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9-#]{2,}");
		Matcher m = p.matcher(s);
		if(m.find()&& m.group().equals(s)) {
			System.out.println("valid identifier");
		} else {
			System.out.println("Invalid identifier");
		}
	}
}

public class ExampleOfRegex {

	public static void main(String[] args) {
		demo demo = new demo();
		demo.m1();
	}

}
