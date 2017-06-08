package com.infor.dto;

import java.util.List;

import com.infor.models.AjaxResponseBody;
import com.infor.models.InforCar;
import com.infor.models.InforParking;
import com.infor.models.InforUser;

public class TransactionDTO {
	private InforParking inforParking;
	private List<InforCar> inforCars;
	private InforUser tandemParkingDetails;
	private AjaxResponseBody ajaxResponseBody;
	public InforParking getInforParking() {
		return inforParking;
	}
	public void setInforParking(InforParking inforParking) {
		this.inforParking = inforParking;
	}
	public AjaxResponseBody getAjaxResponseBody() {
		return ajaxResponseBody;
	}
	public void setAjaxResponseBody(AjaxResponseBody ajaxResponseBody) {
		this.ajaxResponseBody = ajaxResponseBody;
	}
	public InforUser getTandemParkingDetails() {
		return tandemParkingDetails;
	}
	public void setTandemParkingDetails(InforUser tandemParkingDetails) {
		this.tandemParkingDetails = tandemParkingDetails;
	}
	public List<InforCar> getInforCars() {
		return inforCars;
	}
	public void setInforCars(List<InforCar> inforCars) {
		this.inforCars = inforCars;
	}
}
