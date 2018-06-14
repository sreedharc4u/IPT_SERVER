package com.fuso.enterprise.ipt.srv.api.service.functional;

import java.util.List;

import com.fuso.enterprise.ipt.srv.api.model.domain.UserDetails;

public interface IPTUserService {
	
	List<UserDetails> getUsersForApproval(String userId);
	UserDetails userAuthentication(String userId);

}
