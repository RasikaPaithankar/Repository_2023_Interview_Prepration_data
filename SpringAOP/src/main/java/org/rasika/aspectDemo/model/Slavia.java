package org.rasika.aspectDemo.model;

import org.rasika.aspectDemo.aspect.Loggable;

public class Slavia {

	boolean isTopModel;
	String color;
	int modelNumber;
	public boolean isTopModel() {
		return isTopModel;
	}
	public void setIsTopModel(boolean isTopModel) {
		this.isTopModel = isTopModel;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	
	public void displayFeatures() {
		System.out.println("Its having 50 features");
	}
	
	public void ratings() {
		System.out.println("5* ratings");
	}
	
	public boolean isPopular(boolean check) {
		return check;
	}
	
	@Loggable
	public String marketing() {
		return "Slavia is premium car..";
	}
	
	@Override
	public String toString() {
		return "Slavia [isTopModel=" + isTopModel + ", color=" + color + ", modelNumber=" + modelNumber + "]";
	}
}
