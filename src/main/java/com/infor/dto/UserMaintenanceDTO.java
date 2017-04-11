package com.infor.dto;

import java.util.List;

import com.infor.models.InforRoles;

public class UserMaintenanceDTO {
	public UserMaintenanceDTO(){}
	
	private List<InforRoles> inforRoles;
	
	public List<InforRoles> getInforRoles() {
		return inforRoles;
	}

	public void setInforRoles(List<InforRoles> inforRoles) {
		this.inforRoles = inforRoles;
	} 
}
