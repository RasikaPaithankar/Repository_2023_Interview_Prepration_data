package com.java.practice;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*	
 	Regular Expression
  -	A Regular Expression is a expression which represents a group of Strings according to a particular pattern.
  - e.g., 
  	1. write a Regular Expression to represent all valid mail ids
  	2. write a Regular Expression to represent all valid mobile numbers.
  - Used for validation purpose.
  
  
  	Pattern and Matcher classes are available in java.util.regex package
	it is introduced in 1.4 version.
  
  	Pattern class
  - Using Pattern class, we can declare pattern which we want to compile for Regex pattern.
  - Pattern class has compile() method, using which we can create pattern object.
  -		public static Pattern compile(String regex)

	Matcher class
  - Using Matcher class, we can match the character sequence (String) against Regex.
  - we can create object of matcher class by using matcher() method Pattern class.
  -		public Matcher matcher(String target);
  
	Imp methods of Matcher class.
   1. boolean find(); -> to find next match character sequence against Regex.
   2. int start(); -> returns start index of the match.
   3. int end(); -> return end index + 1 of the match.
   4. String group(); -> Returns the matched Pattern.

*/

class Test {
	int count;
	
	public void m1() {
		//by default case sensitive pattern matcher
		Pattern pattern = Pattern.compile("RS");
		Matcher matcher = pattern.matcher("rsrsRRS");
		while(matcher.find()) {
			count++;
			System.out.println(matcher.start()+"...."+matcher.end()+"......."+matcher.group());
		}
		System.out.println("count is "+ count);
	}
	
	public void m2() {
		
		// case in-sensitive
		Pattern pattern = Pattern.compile("RS", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("rsrsRRS");
		while(matcher.find()) {
			count++;
			System.out.println(matcher.start()+"...."+matcher.end()+"......."+matcher.group());
		}
		System.out.println("count is "+ count);
	}
	
	
}

/* 	Character classes
 
 	refer to - https://www.digitalocean.com/community/tutorials/regular-expression-in-java-regex-example

	1. [abc]-------------------Either 'a' or 'b' or 'c'.
	2. [abc][12]---------------Can match a, b or c followed by 1 or 2
	3. ^abc-----------------Matches abc regex at the beginning of the line.
	4. abc$-------------------Matches abc regex at the end of the line.
	5. [^abc]-----------------Matches anything except a, b or c.
	6. [a-z] --------------------Any lower case alphabet symbol
	7. [A-Z] --------------------Any upper case alphabet symbol
	8. [a-zA-Z] ----------------Any alphabet symbol
	9. [0-9] --------------------Any digit from 0 to 9
   10. [a-zA-Z0-9] ------------Any alphanumeric character
   11. [^a-zA-Z0-9] ------------Any special character i.e., except alphanumeric character
   12. [a-e1-8] ----------------Matches ranges between a to e or 1 to 8
   
   
   . When ^ is the first character in [], it negates the pattern.

*/

class Character {
	String str = "^ab|ab$";
	String str0 = "[ab]";
	String str1 = "[ab][12]";
	String str2 = "^ab";
	String str3 = "ab$";
	String str4 = "[^ab]";
	String str5 = "[a-z]";
	String str6 = "[A-Z]";
	String str7 = "[0-9]";
	String str8 = "[a-zA-Z0-9]";
	String str9 ="[^a-zA-Z0-9]";
	String str10 ="[a-e1-8]";
	
	public void m1() {
		Pattern p = Pattern.compile(str10);
		Matcher m = p.matcher("YY2ST69x7@*(ab");
		
		while(m.find()) {
			System.out.println(m.start()+"......."+m.group());
//			System.out.println(Pattern.matches("abST677@*abs", "^ab"));
		}
		
	}
}

/*
 	Predefined character classes
 	
 	\s---------------------space character 
	\d---------------------Any digit from o to 9[o-9] 
	\w---------------------Any word character[a-zA-Z0-9]
	\b---------------------A word boundary
	. ---------------------Any character including special characters. 
	\S---------------------any character except space character
	\D---------------------any character except digit 
	\W---------------------any character except word character(special character)  
	\B---------------------A non word boundary

 */

class PredefinedCharacter {
	String str = "\s";
	String str1 = "\\d";
	String str2 = "\\w";
	String str3 = ".";
	String str4 = "\\S";
	String str5 = "\\D";
	String str6 = "\\W";
	String str7 = "\\b";
	String str8 = "\\B";
	
	public void m1() {
		System.out.println("Predefined character classes");
		Pattern pattern = Pattern.compile(str);
		Matcher matcher = pattern.matcher("a1b7 @z#");
		while(matcher.find()) {
			System.out.println(matcher.start()+"........"+matcher.group());
		}
	}
}


/*
 	Quantifiers
 	
 	Quantifiers can be used to specify no of characters to match.
 	
	a		----------------------Exactly one 'a'
	a+		----------------------At least one 'a'
	a*		----------------------Any no of a's including zero number
	a? 		----------------------a occurs once or not at all
	X{n}	----------------------X occurs exactly n times
	X{n,} 	--------------------X occurs n or more times
	X{n,m} 	-------------------X occurs at least n times but not more than m times
 	
 */

class Quantifiers {
	
	String str = "(a)";
	String str1 = "(a)+";
	String str2 = "(a)*";
	String str3 = "(a)?";
	String str4 = "(a){2}";
	String str5 = "(a){2,}";
	String str6 = "(a){3,3}";
	public void m1() {
		System.out.println("Quantifiers......");
		Pattern p = Pattern.compile(str6);
		Matcher m = p.matcher("abaabaaab");
		while(m.find()) {
			System.out.println(m.start()+"........."+m.group());
		}
	}
}

/*
 * 	Pattern class split() method
 	Pattern class contains split() method to split the given string against a regular expression. 
	pattern class split() method can take target string as the argument
 	
 */
class Split {
	public void m1() {
		Pattern p = Pattern.compile("\\.");    				// OR \\s OR [.] 
		String s[] = p.split("www.study.com");				// argument -> Targeted String
 		for (String s1 : s) {
			System.out.println(s1);
		}
	}
}

/*
  	String class split() method
  	String class also contains split() method to split the given string against a regular expression.
  	String class split() method can take regular expression as argument
  
 */

class StringSplit {
	public void m1() {
		String str = "www.study.com";
		String [] s = str.split("\\.");					// argument -> Regular expression
		for (String s1 : s) {
			System.out.println(s1);
		}
	}
}


public class Regex {

	public static void main(String[] args) {
		Test test = new Test();
		test.m1();		
		test.m2();
		
		Character character = new Character();
		character.m1();
		
		PredefinedCharacter pc = new PredefinedCharacter();
		pc.m1();
		
		Quantifiers quantifiers = new Quantifiers();
		quantifiers.m1();
		
		Split split = new Split();
		split.m1();
		
		StringSplit stringSplit = new StringSplit();
		stringSplit.m1();
	}

}
