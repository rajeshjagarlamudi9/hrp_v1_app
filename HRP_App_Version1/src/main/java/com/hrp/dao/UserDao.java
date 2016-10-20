package com.hrp.dao;

import java.util.List;

import com.hrp.model.User;

public interface UserDao {

	public List<User> loginUser(String username);

	public void registerUser(User user);

}
