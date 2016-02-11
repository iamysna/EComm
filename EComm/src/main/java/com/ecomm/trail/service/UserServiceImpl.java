package com.ecomm.trail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecomm.trail.dao.UserDao;
import com.ecomm.trail.model.User;
import com.ecomm.trail.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDeo;
	
	@Transactional
	public void add(User user) {
		// TODO Auto-generated method stub
		userDeo.add(user);
	}

	@Transactional
	public void edit(User user) {
		// TODO Auto-generated method stub
		userDeo.edit(user);
	}

	@Transactional
	public void delete(int userid) {
		// TODO Auto-generated method stub
		userDeo.delete(userid);
	}

	@Transactional
	public User getUser(int userid) {
		// TODO Auto-generated method stub
		return userDeo.getUser(userid);
	}

	@Transactional
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userDeo.getAllUser();
	}

}
