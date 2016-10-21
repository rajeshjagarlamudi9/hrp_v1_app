package com.hrp.service;

import java.util.List;

import com.hrp.model.UserServices;

public interface UserServicesService{

	List<UserServices> getAllActiveServicesByUserId(Long userId);
}
