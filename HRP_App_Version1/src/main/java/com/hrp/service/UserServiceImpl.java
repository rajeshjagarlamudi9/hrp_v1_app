package com.hrp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrp.dao.UserDao;
import com.hrp.model.User;

@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	 public List<User> loginUser(String username){
		return userDao.loginUser(username);
	}
 
	 public void registerUser(User user){
		 userDao.registerUser(user);
	 }

}
