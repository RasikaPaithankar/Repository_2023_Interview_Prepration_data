package com.demo.spring.springjdcdemo.dao;

import com.demo.spring.springjdcdemo.pojo.Cops;

public interface CopsDao {

	public void getCops();
	public Integer addCops(Cops c);
	public Integer updateCops(Cops c);
	public Integer deleteCops(Integer id);
}
