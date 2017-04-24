package com.infor.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_inforparking")
public class InforParking {
	public InforParking(){}
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "parkingid")
	private String parkingid;
	
    @Column(name = "userid")
	private int userid;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Column(name = "isparkingtandem")
	private String isparkingtandem;

	@Column(name = "tandemposition")
	private String tandemposition;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getParkingid() {
		return parkingid;
	}

	public void setParkingid(String parkingid) {
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
