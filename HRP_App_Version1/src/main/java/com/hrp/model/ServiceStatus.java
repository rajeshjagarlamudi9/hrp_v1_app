package com.hrp.model;

import java.util.List;

public class ServiceStatus {

	private String status;
	private String message;
	private Object result;
	private Object apiKey;
	private Object errors;
	private Object friendlyErrors;
	
	
	
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getApiKey() {
		return apiKey;
	}
	public void setApiKey(Object apiKey) {
		this.apiKey = apiKey;
	}
	public Object getErrors() {
		return errors;
	}
	public void setErrors(Object errors) {
		this.errors = errors;
	}
	public Object getFriendlyErrors() {
		return friendlyErrors;
	}
	public void setFriendlyErrors(Object friendlyErrors) {
		this.friendlyErrors = friendlyErrors;
	}
	
	
}
