package com.java.practice;

/*
 * Definition of exception - An unwanted unexpected event that disturbs normal flow of the program is called exception.
 * 
 * objective of exception is to avoid abnormal termination of program.
 * 
 * we can handle exception in two ways	
 *  1. using try - catch block
 *  2. using throws keyword.
*/
public class ExceptionClass {
	
	
// 	throws -> it is provide responsibility of exception handling to caller method.
//			  We can use throws keyword only for constructors and methods but not for classes.
	
	public void m1() throws NullPointerException {
//	try block is responsible to maintain code due to which exception can occur.
		try {
			System.out.println(10/0);

// 	catch block is responsible to maintain exception handling code. 			
		} catch (ArithmeticException a) {
			a.printStackTrace();
// 	throw -> to hand over exception object to JVM manually.
//			 after throw statement we can not have any statement.
// 			 only we can use throw keyword only for throwable types otherwise we will get C.E.
			throw a;
		} catch (Exception e) {
			e.getMessage();
// finally block is responsible to execute the code for clean up 
// such as closing connection, closing resources, etc.
// even exception not occur finally block will execute for clean up.			
		} finally {
			System.out.println("Finally is reponsible for the clean up code.");
		}
	}
		
	public static void main(String[] args) {
		
	}

}


// 

// valid combinations of try catch finally

//	1. try {} - catch {}
//	2. try {} - catch (X e) {}
//	3. try {} - catch (X e) {} - finally {}
//	4. try {} - finally {}

// Invalid combination of try catch finally

//	1. try {} - catch (X e) {} - catch (X e) {}
// 	2. try {} 										//CE: 'try' without 'catch', 'finally' or resource declarations
//  3. catch (X e) {} 								//CE: 'catch' without 'try'
//	4. finally {} 									//CE: 'finally' without 'try'

// 5. try {} 										//CE: 'try' without 'catch', 'finally' or resource declarations
// 		System.out.println("Hello");
//	  catch {} 										//CE: 'catch' without 'try'


// 6. try {}
//	  finally {}
//	  catch (X e) {} //CE: 'catch' without 'try'

