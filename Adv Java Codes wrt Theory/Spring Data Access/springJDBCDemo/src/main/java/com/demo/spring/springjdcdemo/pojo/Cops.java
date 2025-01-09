package com.demo.spring.springjdcdemo.pojo;

import org.springframework.stereotype.Component;

@Component
public class Cops {

	Integer id;
	String name;
	public Cops() {
		super();
	}
	public Cops(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Cops [id=" + id + ", name=" + name + "]";
	}
}
