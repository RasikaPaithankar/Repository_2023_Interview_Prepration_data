package org.rasika.aspectDemo;

import org.rasika.aspectDemo.service.CarService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	CarService carService = (CarService) context.getBean("carService");
    	System.out.println(carService.toString());
    	
    	System.out.println(carService.getNano().getModelNumber());
    	System.out.println(carService.getAlto().getModelNumber());
    	
    	System.out.println(carService.getNano().m1());
    	System.out.println(carService.getAlto().m1());
    	
    	
    	carService.getNano().calculateCost();
    	carService.getAlto().calculateCost();
    	
    	System.out.println(carService.getNano().calculateTax());
    	System.out.println(carService.getAlto().calculateTax());
    	
    	System.out.println(carService.getNano().calculateOnRoadPrice());
    	System.out.println(carService.getAlto().calculateOnRoadPrice());
    	
    	System.out.println(carService.getSlavia().getColor());
    	System.out.println(carService.getSlavia().getModelNumber());
    	System.out.println(carService.getSlavia().isTopModel());
    	carService.getSlavia().displayFeatures();
    	carService.getSlavia().ratings();
    	carService.getSlavia().isPopular(true);
    	
    	
    	System.out.println(carService.getAlto().marketing());;
    	System.out.println(carService.getNano().marketing());
    	System.out.println(carService.getSlavia().marketing());
    	
    }
}
