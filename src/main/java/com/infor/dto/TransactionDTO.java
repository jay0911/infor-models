package com.infor.dto;

import com.infor.models.AjaxResponseBody;
import com.infor.models.InforParking;

public class TransactionDTO {
	private InforParking inforParking;
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
}
