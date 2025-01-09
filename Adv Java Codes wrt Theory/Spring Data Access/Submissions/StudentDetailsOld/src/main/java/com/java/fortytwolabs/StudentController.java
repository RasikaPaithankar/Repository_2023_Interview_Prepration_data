package com.java.fortytwolabs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class StudentController {


	public void getStudent() 
	{
		System.out.println("I am here");
	}
}
