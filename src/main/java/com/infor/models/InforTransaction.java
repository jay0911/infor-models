package com.infor.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_infortransaction")
public class InforTransaction {
	public InforTransaction(){}
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transactionid;
	
	@Column(name = "userid")
	private int userid;
	
	@Column(name = "parkingid")
	private String parkingid;
	
	@Column(name = "carid")
	private int carid;
	
	@Column(name = "timein")
	private String timein;
	
	@Column(name = "timeout")
	private String timeout;
	
	
	public int getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getParkingid() {
		return parkingid;
	}

	public void setParkingid(String parkingid) {
		this.parkingid = parkingid;
	}

	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public String getTimein() {
		return timein;
	}

	public void setTimein(String timein) {
		this.timein = timein;
	}

	public String getTimeout() {
		return timeout;
	}

	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

}
