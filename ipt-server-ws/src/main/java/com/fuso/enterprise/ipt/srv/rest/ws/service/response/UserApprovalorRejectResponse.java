package com.fuso.enterprise.ipt.srv.rest.ws.service.response;

import java.util.List;

import com.fuso.enterprise.ipt.srv.api.model.domain.UserDetails;

public class UserApprovalorRejectResponse {
	
	protected List<UserDetails> usersForRejectorApproval;
	protected String responseText;
	protected String responseCode;

	public String getResponseText() {
		return responseText;
	}

	public void setResponseText(String responseText) {
		this.responseText = responseText;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public List<UserDetails> getUsersForRejectorApproval() {
		return usersForRejectorApproval;
	}

	public void setUsersForRejectorApproval(List<UserDetails> usersForRejectorApproval) {
		this.usersForRejectorApproval = usersForRejectorApproval;
	}
	
	

}
