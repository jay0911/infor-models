package com.infor.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_inforparking")
public class InforParking {
	public InforParking(){}
	
	@Id
	@Column(name = "parkingid")
	private int parkingid;
	
	@Column(name = "userid")
	private int userid;
	
	@Column(name = "isparkingtandem")
	private String isparkingtandem;
	
	@Column(name = "tandemposition")
	private String tandemposition;
	
	public int getParkingid() {
		return parkingid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public void setParkingid(int parkingid) {
		this.parkingid = parkingid;
	}

	public String getIsparkingtandem() {
		return isparkingtandem;
	}

	public void setIsparkingtandem(String isparkingtandem) {
		this.isparkingtandem = isparkingtandem;
	}

	public String getTandemposition() {
		return tandemposition;
	}

	public void setTandemposition(String tandemposition) {
		this.tandemposition = tandemposition;
	}

}
