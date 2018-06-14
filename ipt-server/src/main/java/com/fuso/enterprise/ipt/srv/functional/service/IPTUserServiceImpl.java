package com.fuso.enterprise.ipt.srv.functional.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fuso.enterprise.ipt.srv.api.model.domain.UserDetails;
import com.fuso.enterprise.ipt.srv.api.service.functional.IPTUserService;
import com.fuso.enterprise.ipt.srv.server.dao.UserServiceDAO;

@Service
@Transactional
public class IPTUserServiceImpl implements IPTUserService {
	
	private UserServiceDAO userServiceDAO;
	 
	@Inject
	public IPTUserServiceImpl(UserServiceDAO userServiceDAO) {
		this.userServiceDAO=userServiceDAO;
	}
	
	@Override
	public List<UserDetails> getUsersForApproval(String userId) {
		return userServiceDAO.getUsersForApproval(userId);
	}

	@Override
	public UserDetails userAuthentication(String userId) {
		return userServiceDAO.userAuthentication(userId);
	}
	
}
