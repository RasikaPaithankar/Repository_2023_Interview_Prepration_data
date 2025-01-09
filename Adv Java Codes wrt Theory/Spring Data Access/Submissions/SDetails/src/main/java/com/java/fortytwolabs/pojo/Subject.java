package com.java.fortytwolabs.pojo;

public class Subject {
	private Integer maths;
	private Integer physics;
	public Subject() {
	}
	public Subject(Integer maths, Integer physics) {
		super();
		this.maths = maths;
		this.physics = physics;
	}
	public Integer getMaths() {
		return maths;
	}
	public void setMaths(Integer maths) {
		this.maths = maths;
	}
	public Integer getPhysics() {
		return physics;
	}
	public void setPhysics(Integer physics) {
		this.physics = physics;
	}
	@Override
	public String toString() {
		return "Subject [maths=" + maths + ", physics=" + physics + "]";
	}	
}
