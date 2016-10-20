package com.hrp.service;

import java.util.List;

import com.hrp.model.User;

public interface UserService {

	public List<User> loginUser(String username);

	public void registerUser(User user);


}
