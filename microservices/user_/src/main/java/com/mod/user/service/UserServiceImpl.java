package com.mod.user.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mod.user.dao.UserDao;
import com.mod.user.model.User;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
private UserDao userDao;
	
	public void insertUser(User user) throws SQLException {
	userDao.save(user);
	

	}
	
	@Override
	public List<User> findByemail(String email) {
		// TODO Auto-generated method stub
		return userDao.findByemail(email);
	}

	@Override
	public List<User> getuserList() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	

	
	

}
