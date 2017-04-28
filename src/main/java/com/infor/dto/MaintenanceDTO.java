package com.infor.dto;

import java.util.List;

import com.infor.models.InforCar;
import com.infor.models.InforParking;
import com.infor.models.InforRoles;
import com.infor.models.InforUser;

public class MaintenanceDTO {
	public MaintenanceDTO(){}
	
	private List<InforRoles> inforRoles;
	private List<InforUser> inforUsers;
	private InforUser inforUser;
	private InforCar inforCar;
	private List<InforCar> inforCars;
	private List<InforParking> inforParkings;

	private int userid;
	private String firstname;
	private String lastname;
	private String contactnumber;
	private String emailaddress;
	private String address;
	private String gender;
	private String position;
	private String username;
	private String password;
	
	private String carplatenumber;
	private String carbrand;
	private String carcolor;
	
	private String isparkingtandem;
	private String parkingid;
	
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


	public InforCar getInforCar() {
		return inforCar;
	}

	public void setInforCar(InforCar inforCar) {
		this.inforCar = inforCar;
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

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public List<InforCar> getInforCars() {
		return inforCars;
	}

	public void setInforCars(List<InforCar> inforCars) {
		this.inforCars = inforCars;
	}

	public List<InforParking> getInforParkings() {
		return inforParkings;
	}

	public void setInforParkings(List<InforParking> inforParkings) {
		this.inforParkings = inforParkings;
	}

	public String getIsparkingtandem() {
		return isparkingtandem;
	}

	public void setIsparkingtandem(String isparkingtandem) {
		this.isparkingtandem = isparkingtandem;
	}

	public String getParkingid() {
		return parkingid;
	}

	public void setParkingid(String parkingid) {
		this.parkingid = parkingid;
	}
}
