package com.ecomm.trail.dao;

import java.util.List;

import com.ecomm.trail.model.User;

public interface UserDao {
	public void add(User user);
	public void edit(User user);
	public void delete(int userid);
	public User getUser(int userid);
	public List<User> getAllUser();
}
