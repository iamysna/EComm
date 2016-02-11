package com.ecomm.dao;

import java.util.List;

import com.ecomm.web.Productadd;

public interface ProductDAO {
	public Integer addproduct(Productadd re);
	public List<Productadd> listproduct();
	public void remove(Integer id);
	  
	}

