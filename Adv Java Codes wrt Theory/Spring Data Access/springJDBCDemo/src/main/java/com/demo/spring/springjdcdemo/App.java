package com.demo.spring.springjdcdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.springjdcdemo.daoImplmentation.CopsDaoImp;
import com.demo.spring.springjdcdemo.pojo.Cops;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	CopsDaoImp copsDaoImp= (CopsDaoImp) context.getBean("copsdaoimp");
    	
    	Cops cops = (Cops) context.getBean("cops");
    	
    	Integer result = copsDaoImp.addCops(cops);
    	System.out.println(result);
    	
    	Cops cops1 = (Cops) context.getBean("cops1");
    	Integer result1 = copsDaoImp.addCops(cops1);
    	System.out.println(result1);
    	
    	copsDaoImp.getCops();
    }
}
