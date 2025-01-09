package com.java.practice;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateInterface {

	public static void main(String[] args) {
		Predicate<Integer> p = (i) -> {
			return i > 18;
		};
		
		if(p.test(20)) {
			System.out.println("you can vote");
		} else {
			System.out.println("You are minor");
		}
		
//		System.out.println(p.negate());
//		System.out.println(p.and(p));
//		System.out.println(p.or(p));
//		System.out.println(Predicate.isEqual(p));
		
		BiPredicate<Integer, Integer> bip = (i,j)->{
			return i > j;
		};
		
		System.out.println(10 > 8);
	}
}
