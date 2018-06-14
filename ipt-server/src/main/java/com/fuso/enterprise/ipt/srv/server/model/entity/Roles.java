package com.fuso.enterprise.ipt.srv.server.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Roles {
	private static final long      serialVersionUID = 7360672237739183568L;
	
	@Id
    @Column(name = "id")
    private String   id;
	
	@Column(name = "role_id")
    private String    role_id;
	
	@Column(name = "role_name")
    private String    role_name;
	
	@Column(name = "role_desc")
    private String    role_desc;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRole_id() {
		return role_id;
	}

	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getRole_desc() {
		return role_desc;
	}

	public void setRole_desc(String role_desc) {
		this.role_desc = role_desc;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
