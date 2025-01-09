package com.java.practice;

import java.util.function.Supplier;

public class SupplierInterfaceExample {

	public static void main(String[] args) {
		
		Supplier<String> s = () -> {
			return "Hello Team.";
		};
		System.out.println(s.get());
	}

}
