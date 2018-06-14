package com.fuso.enterprise.ipt.srv.rest.ws.service.response;

import com.fuso.enterprise.ipt.srv.api.model.domain.UserDetails;

public class UserAuthenticationResponse {
	
	private UserDetails userdetails;
	protected String responseText;
	protected String responseCode;
	
	public UserDetails getUserdetails() {
		return userdetails;
	}
	public void setUserdetails(UserDetails userdetails) {
		this.userdetails = userdetails;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseText() {
		return responseText;
	}
	public void setResponseText(String responseText) {
		this.responseText = responseText;
	}
	
	

}
