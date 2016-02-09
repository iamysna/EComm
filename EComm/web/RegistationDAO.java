package com.ecomm.web;

import java.util.List;

public interface RegistationDAO {
	public void adddetails(RegistationCus re);
	public List<RegistationCus> listCustomer();
	public void remove(Integer id);
	  
	}

