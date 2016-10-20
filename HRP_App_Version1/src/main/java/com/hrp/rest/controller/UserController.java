package com.hrp.rest.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hrp.model.ServiceStatus;
import com.hrp.model.User;
import com.hrp.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userservice;

	@RequestMapping(value ="/loginUser/{username}", method = RequestMethod.GET)
	public @ResponseBody ServiceStatus loginUser(@PathVariable("username") String username) throws Exception {
		
		
		ServiceStatus regstatus = new ServiceStatus();
		
		
		List<User> userDetails =  userservice.loginUser(username);
		regstatus.setResult(userDetails);
		if(userDetails.size() != 0){
			regstatus.setMessage("success");
		}
		else regstatus.setMessage("failure");
		return regstatus;
		
	}
	@RequestMapping(value ="/registerUser", method = RequestMethod.POST, 
			produces={"application/json"})
	public @ResponseBody ServiceStatus registerUser(@RequestBody User user) throws Exception {
		ServiceStatus regstatus=new ServiceStatus();
		regstatus.setMessage("success");
		Date date = new Date();
		user.setCreated_date(date);
		try{
			userservice.registerUser(user);
		}catch(Exception e){
			regstatus.setMessage(e.toString());
		}
		return regstatus;
	}

}
