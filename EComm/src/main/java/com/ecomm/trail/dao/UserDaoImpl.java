package com.ecomm.trail.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecomm.trail.dao.UserDao;
import com.ecomm.trail.model.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public void edit(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(user);
	}

	@Override
	public void delete(int userid) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(getUser(userid));
	}

	@Override
	public User getUser(int userid) {
		// TODO Auto-generated method stub
		return (User)sessionFactory.getCurrentSession().get(User.class, userid);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return (List<User>) sessionFactory.getCurrentSession().createQuery("from User").list();
	}

}
