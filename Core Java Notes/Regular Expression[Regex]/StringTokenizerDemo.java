package com.java.practice;

import java.util.StringTokenizer;

/*	StringTokenizer
  -	This class present in java.util package.
  - It is a specially designed class to perform string tokenization.
  - The default regular expression for the StringTokenizer is space. 
	
*/

/*	
	hasMoreToken()
  -	If there are more tokens available from this tokenizer's string.
  -	If this method returns true, then a subsequent call to nextToken with no argument will successfully return a token.
	
	hasMoreElements()
  -	Returns the same value as the hasMoreTokensmethod.
  -	It exists so that this class can implement the Enumeration interface.

*/
class MyClass {
	public void m1() {
		// The default regular expression for the StringTokenizer is space.
		StringTokenizer stringTokenizer = new StringTokenizer("Java is a rich in library.");
		while(stringTokenizer.hasMoreElements()) {
			System.out.println(stringTokenizer.nextElement());
		}
		System.out.println("***********************************");
		while(stringTokenizer.hasMoreTokens()) {
			System.out.println("unable to print it as StringTokenizer dont have more tokens i.e., its modified in above loop");
			System.out.println(stringTokenizer.nextToken());
		}
	}
	
	public void m2() {
		// here regular expression for the StringTokenizer is "." 
		StringTokenizer stringTokenizer = new StringTokenizer("1.1.1.222232" , ".");
		while (stringTokenizer.hasMoreElements()) {
			System.out.println( stringTokenizer.nextElement());
			
		}
	}
}


public class StringTokenizerDemo {

	public static void main(String[] args) {
		MyClass m = new MyClass();
		m.m1();
		
		m.m2();
	}

}
