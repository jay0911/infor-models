package com.infor.dto;

import java.util.List;

import com.infor.models.InforRoles;
import com.infor.models.InforUser;

public class UserMaintenanceDTO {
	public UserMaintenanceDTO(){}
	
	private List<InforRoles> inforRoles;
	private List<InforUser> inforUsers;
	private InforUser inforUser;

	private String firstname;
	private String lastname;
	private String contactnumber;
	private String emailaddress;
	private String address;
	private String gender;
	private String position;
	private String username;
	private String password;
	
	public List<InforUser> getInforUsers() {
		return inforUsers;
	}

	public void setInforUsers(List<InforUser> inforUsers) {
		this.inforUsers = inforUsers;
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

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<InforRoles> getInforRoles() {
		return inforRoles;
	}

	public void setInforRoles(List<InforRoles> inforRoles) {
		this.inforRoles = inforRoles;
	}

	public InforUser getInforUser() {
		return inforUser;
	}

	public void setInforUser(InforUser inforUser) {
		this.inforUser = inforUser;
	} 
}
