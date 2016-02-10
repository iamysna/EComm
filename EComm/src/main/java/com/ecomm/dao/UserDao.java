package com.ecomm.dao;

import java.util.List;

import com.ecomm.pojo.User;


public interface UserDao {
	
	public void addUser(User user);
	
	public User getUser(Long userId);
	
	public User getUserByUserName(String userName);
	
	public List<User> getAllUsers();

}
