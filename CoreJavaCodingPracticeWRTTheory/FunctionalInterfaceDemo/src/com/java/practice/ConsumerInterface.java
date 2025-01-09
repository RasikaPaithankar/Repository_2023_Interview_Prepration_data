package com.java.practice;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerInterface {

	public static void main(String[] args) {
		Consumer<String> c = (String i)-> {
			System.out.println(i);
		};	
		c.accept("I dont return anything");
		
		
		BiConsumer<Integer, Integer> bicon = (age, percentage) -> {
			if (age > 14 && percentage > 75)
                System.out.println("You're eligible to participate in school elections");
            else
                System.out.println("The eligibility criteria is Age > 14 and Percentage > 75");
		};
		
		bicon.accept(15, 80);
	}
}
