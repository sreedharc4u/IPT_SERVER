package com.fuso.enterprise.ipt.srv.server.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_roles")
public class UserRoles {
	private static final long      serialVersionUID = 7360672237739183568L;

	@Id
    @Column(name = "id")
    private String   id;
	
	@Column(name = "user_id")
    private String    user_id;
	
	@Column(name = "role_id")
    private String    role_id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getRole_id() {
		return role_id;
	}

	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
