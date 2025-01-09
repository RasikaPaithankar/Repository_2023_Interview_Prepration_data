package org.rasika.aspectDemo.model;

import org.rasika.aspectDemo.aspect.Loggable;

public class Alto implements Car{

	int modelNumber;
	
	public int getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	
	public void run() {
		System.out.println("alto running");
	}
	
	public String m1() {
		return modelNumber + "is latest model";
	}
	
	public void m1(int modelNumber) {
		System.out.println("m1 is latest model");
	}

	public void calculateCost() {
		System.out.println("21");
	}
	
	public String calculateTax() {
		return "5";
	}
	
	public Integer calculateOnRoadPrice() {
		return 26;
	}
	
	@Loggable
	public String marketing() {
		return "Alto is affordable car..";
	}
	
	@Override
	public String toString() {
		return "Alto [modelNumber=" + modelNumber + "]";
	}
}
