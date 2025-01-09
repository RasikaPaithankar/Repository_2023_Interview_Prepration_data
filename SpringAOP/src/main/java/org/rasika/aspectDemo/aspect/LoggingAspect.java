package org.rasika.aspectDemo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before(value = "execution(public int get*())")
	public void LoggingAdvice() {
		System.out.println("logging");
	}

	@Before(value = "execution(public * m*(..))")
	public void LoggingAdvice1() {
		System.out.println("logging - m1");
	}
	
	@Pointcut(value = "execution(public * calculate*())")
	public void allCalculation() {}
	
	@Before(value = "allCalculation()")
	public void logForCalculations() {
		System.out.println("logging - Calculations");
	}
	
	@Pointcut(value = "within(org.rasika.aspectDemo.model.Slavia)")
	public void printLogAdviceForSlavia() {
		System.out.println("Slavia is best");
	}
	
	@Pointcut(value = "within(org.rasika.aspectDemo.model.*)") // all classes from the package
	public void printLogAdviceForSlavia1() {
		System.out.println("Slavia 1 is best");
	}

	@Pointcut(value = "within(org.rasika.aspectDemo.model..*)") // all classes from the package and sub-package
	public void printLogAdviceForSlavia2() {
		System.out.println("Slavia 2 is best");
	}
	
	@Pointcut(value = "args(String)")					// matches arguments
	public void printLogAdviceForSlavia3() {
		System.out.println("Slavia 3 is best");
	}
	
	@After(value = "args(String)")
	public void print1() {
		System.out.println("Print 1");
	}
	
	@AfterReturning(value = "args(name)")
	public void print2(String name) {
		System.out.println("Print 1" + name);
	}
	
	@AfterThrowing(value = "args(name)")
	public void print3(String name) {
		System.out.println("Print 1" + name);
	}
	
	@AfterReturning(pointcut = "args(name)", returning = "returnName" )
	public void print4(String name, String returnName) {
		System.out.println("Name  " + name + " " + "returnName  " + returnName);
	}
	
	@AfterThrowing(pointcut = "args(name)", throwing = "throwName" )
	public void print5(String name, String throwName) {
		System.out.println("Name  " + name + " " + "returnName  " + throwName);
	}
	
	
	@Around("allCalculation()")
	public void myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		try 
		{
			System.out.println("Before execution of method");
			proceedingJoinPoint.proceed();
			System.out.println("After execution of method");
		} catch(Throwable e) {
			System.out.println("after throwing");
		}
		System.out.println("Finally");
	}
	
	
	@After("@annotation(org.rasika.aspectDemo.aspect.Loggable)")
	public void myAdviceForAnnotationLoggable() 
	{
		System.out.println("Following is marketing Strategy");
	}
	
}
