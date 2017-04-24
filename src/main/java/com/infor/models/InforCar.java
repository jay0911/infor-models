package com.infor.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_inforcars")
public class InforCar {
	public InforCar(){}
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "carid")
	private int carid;
	
    @Column(name = "userid")
	private int userid;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	@Column(name = "carplatenumber")
	private String carplatenumber;

	@Column(name = "carbrand")
	private String carbrand;
	
	@Column(name = "carcolor")
	private String carcolor;
	
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}

	public String getCarplatenumber() {
		return carplatenumber;
	}

	public void setCarplatenumber(String carplatenumber) {
		this.carplatenumber = carplatenumber;
	}

	public String getCarbrand() {
		return carbrand;
	}

	public void setCarbrand(String carbrand) {
		this.carbrand = carbrand;
	}

	public String getCarcolor() {
		return carcolor;
	}

	public void setCarcolor(String carcolor) {
		this.carcolor = carcolor;
	}

}
