package com.ecomm.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


public class RegistationImp implements RegistationDAO{


	@Override
	public void adddetails(RegistationCus re) {
		
		// TODO Auto-generated method stub
		//sessionFactory.getCurrentSession().save(re);
		
	}

	@Override
	public List<RegistationCus> listCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
