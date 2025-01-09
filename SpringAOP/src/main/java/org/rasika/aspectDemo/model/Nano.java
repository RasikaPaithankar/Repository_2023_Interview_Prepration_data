package org.rasika.aspectDemo.model;

import org.rasika.aspectDemo.aspect.Loggable;

public class Nano implements Car{

	int modelNumber;
	
	public int getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}

	public void run() {
		System.out.println("Nano running");		
	}
	
	public String m1() {
		return modelNumber + "is latest model";
	}
	
	public void m1(int modelNumber) {
		System.out.println("m1 is latest model");
	}
	
	public void calculateCost() {
		System.out.println("20");
	}
	
	public String calculateTax() {
		return "2";
	}
	
	public Integer calculateOnRoadPrice() {
		return 22;
	}
	
	@Loggable
	public String marketing() {
		return "Nano is cheapest car..";
	}

	@Override
	public String toString() {
		return "Nano [modelNumber=" + modelNumber + "]";
	}
}
