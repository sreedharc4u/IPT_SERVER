package com.fuso.enterprise.ipt.srv.server.dao;

import java.util.List;

import com.fuso.enterprise.ipt.srv.api.model.domain.UserDetails;

public interface UserServiceDAO {
	
	List<UserDetails> getUsersForApproval(String userId) ;
	UserDetails userAuthentication(String userId) ;
	
}
