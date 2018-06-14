package com.fuso.enterprise.ipt.srv.server.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.fuso.enterprise.ipt.srv.server.dao.UserServiceDAO;
import com.fuso.enterprise.ipt.srv.api.model.domain.UserDetails;
import com.fuso.enterprise.ipt.srv.server.model.entity.Users;
import com.fuso.enterprise.ipt.srv.server.util.AbstractIptDao;

@Repository
public class UserServiceDAOImpl extends AbstractIptDao<Users, String> implements UserServiceDAO {

	public UserServiceDAOImpl() {
		super(Users.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<UserDetails> getUsersForApproval(String userId) {
		
		 Map<String, Object> queryParameter = new HashMap<>();
	        queryParameter.put("userId", userId);
	        List<Users> usrAppr = super.getResultListByNamedQuery("getUserForApproval", queryParameter);
	        //@formatter:off
	        return usrAppr.stream()
	                         .map(users -> convertUserDetailsFromEntityToDomain(users))
	                         .collect(Collectors.toList());
	      //@formatter:on
	}
	
	@Override
	public UserDetails userAuthentication(String userId) {
		UserDetails userDetails = new UserDetails();
		 Map<String, Object> queryParameter = new HashMap<>();
	        queryParameter.put("userId", userId);
	        List<Users> usrAppr = super.getResultListByNamedQuery("getUserForApproval", queryParameter);
	        if(usrAppr.size()>0) 
	        	userDetails = convertUserDetailsFromEntityToDomain(usrAppr.get(0));
	        else 
	        	userDetails = null;
	        return userDetails;
	}

	private UserDetails convertUserDetailsFromEntityToDomain(Users user) {
		UserDetails userDetails = new UserDetails();
		userDetails.setUserid(user.getUserid());
		userDetails.setFirstname(user.getFirstname());
		userDetails.setLastname(user.getLastname());
		userDetails.setEmailId(user.getEmail());
		userDetails.setAddress(user.getAddress());
		userDetails.setApprovedBy(user.getApproved_by());
		userDetails.setApprovedDate(user.getApproved_date());
		userDetails.setContactNo(user.getContact_no());
		userDetails.setDepartmentId(user.getDepartment_id());
		userDetails.setDesignation(user.getDesignation());
		userDetails.setGroupId("");
		userDetails.setNotifyShikeishyo(user.getNotify_shikeishyo_flag());
		userDetails.setRegisteredDate(user.getRegistered_date());
		userDetails.setUsrStatus(user.getUser_status());
		return userDetails;
	}

}
