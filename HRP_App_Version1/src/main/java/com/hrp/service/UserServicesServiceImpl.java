package com.hrp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hrp.dao.UserServicesDao;
import com.hrp.model.UserServices;
@Service("userServicesService")
@Transactional("transactionManager")
public class UserServicesServiceImpl implements UserServicesService{

	@Autowired
	UserServicesDao userServicesDao;
	
	@Override
	public List<UserServices> getAllActiveServicesByUserId(Long userId) {
		return userServicesDao.getAllActiveServicesByUserId(userId);
	}

}
