package com.fuso.enterprise.ipt.srv.server.model.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class Users {
	
	private static final long      serialVersionUID = 7360672237739183568L;

    @Id
    @Column(name = "id")
    private String   id;
 
    @Column(name = "user_id")
    private String    userid;
    
    @Column(name = "first_name")
    private String    firstname;
    
    @Column(name = "last_name")
    private String    lastname;
    
    @Column(name = "email")
    private String    email;
    
    @Column(name = "user_status")
    private String    user_status;
    
    @Column(name = "designation")
    private String    designation;

    @Column(name = "contact_no")
    private String    contact_no;
    
    @Column(name = "address")
    private String    address;
    
    @Column(name = "department_id")
    private String    department_id;
    
    @Column(name = "registered_date")
    private String    registered_date;
    
    @Column(name = "approved_by")
    private String    approved_by;
    
    @Column(name = "approved_date")
    private String    approved_date;
    
    @Column(name = "notify_shikeishyo_flag")
    private String    notify_shikeishyo_flag;
    
    
   	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUser_status() {
		return user_status;
	}

	public void setUser_status(String user_status) {
		this.user_status = user_status;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}

	public String getRegistered_date() {
		return registered_date;
	}

	public void setRegistered_date(String registered_date) {
		this.registered_date = registered_date;
	}

	public String getApproved_by() {
		return approved_by;
	}

	public void setApproved_by(String approved_by) {
		this.approved_by = approved_by;
	}

	public String getApproved_date() {
		return approved_date;
	}

	public void setApproved_date(String approved_date) {
		this.approved_date = approved_date;
	}

	public String getNotify_shikeishyo_flag() {
		return notify_shikeishyo_flag;
	}

	public void setNotify_shikeishyo_flag(String notify_shikeishyo_flag) {
		this.notify_shikeishyo_flag = notify_shikeishyo_flag;
	}
    
    

}
