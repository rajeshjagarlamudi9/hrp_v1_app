package com.hrp.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hrp.model.UserServices;
import com.hrp.service.UserServicesService;
import com.hrp.util.ServiceStatus;

public class UserServicesController {
	
	@Autowired
	UserServicesService userServicesService;
	
	@RequestMapping(value ="/getUserServicesById/{userId}", method = RequestMethod.GET, produces = "application/json" )
	public @ResponseBody ServiceStatus getUserServicesById(@PathVariable("userId") Long userId) {
		ServiceStatus serviceStatus = new ServiceStatus();
		List<UserServices> userServicesList = userServicesService.getAllActiveServicesByUserId(userId);
		if(userServicesList.size() > 0){
			serviceStatus.setResult(userServicesList);
			serviceStatus.setMessage("success");
		}else{
			serviceStatus.setStatus("Failed");
		}
		return serviceStatus;
	}

}
