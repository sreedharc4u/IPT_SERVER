package com.fuso.enterprise.ipt.srv.rest.ws.service;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.fuso.enterprise.ipt.srv.api.model.domain.UserDetails;
import com.fuso.enterprise.ipt.srv.api.service.functional.IPTUserService;
import com.fuso.enterprise.ipt.srv.rest.ws.service.response.UserApprovalorRejectResponse;
import com.fuso.enterprise.ipt.srv.rest.ws.service.response.UserAuthenticationResponse;
import com.fuso.enterprise.ipt.srv.server.util.ResponseWrapper;

@Validated
@Service
public class ITPUsersV18_1WsImpl implements ITPUsersV18_1Ws{
	
	@Inject
	private IPTUserService iptUserService;

	@Override
	public Response getUsersForApproval(String userId) {
		Response response = null;
		try {
			UserApprovalorRejectResponse userApprovalorRejectResponse = new UserApprovalorRejectResponse();
			List<UserDetails> listofUsers = iptUserService.getUsersForApproval(userId);
			if(!listofUsers.isEmpty()) {
				userApprovalorRejectResponse.setUsersForRejectorApproval(listofUsers);
				userApprovalorRejectResponse.setResponseCode("200");
				userApprovalorRejectResponse.setResponseText("Approver User List retrieved successfully");
			}else {
				userApprovalorRejectResponse.setUsersForRejectorApproval(null);
				userApprovalorRejectResponse.setResponseCode("500");
				userApprovalorRejectResponse.setResponseText("No users for Approve or Reject");
			}
			response = buildResponse(userApprovalorRejectResponse);
		}catch(Exception e) {
			
		}
		
		return response;
	}
	
	@Override
	public Response userAuthenication(String userId) {
		Response response = null;
		try {
			UserAuthenticationResponse userAuthenticationResponse = new UserAuthenticationResponse();
			UserDetails userDetails = iptUserService.userAuthentication(userId);//new UserDetails();
			if(userDetails!=null) {
				userAuthenticationResponse.setUserdetails(userDetails);
				userAuthenticationResponse.setResponseCode("200");
				userAuthenticationResponse.setResponseText("User Validated Successfully");
			}else {
				userAuthenticationResponse.setUserdetails(null);
				userAuthenticationResponse.setResponseCode("500");
				userAuthenticationResponse.setResponseText("Authentication Failed");
			}
			response = buildResponse(userAuthenticationResponse);
		}catch(Exception e) {
			
		}
		return response;
	}

	
	protected Response buildResponse(Object data) 
	{
		ResponseWrapper wrapper = new ResponseWrapper(200, data);
		return Response.ok(wrapper).build();
	}

	
}
