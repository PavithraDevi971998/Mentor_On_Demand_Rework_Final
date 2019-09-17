package com.mod.user.service;

import java.sql.SQLException;
import java.util.List;

import com.mod.user.model.User;



public interface UserService {
	 public void insertUser(User user) throws SQLException;

	public List<User> findByemail(String email);

	public List<User> getuserList();

}
