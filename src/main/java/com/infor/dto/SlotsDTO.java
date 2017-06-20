package com.infor.dto;

import java.util.List;

import com.infor.models.InforSlots;

public class SlotsDTO {
	public SlotsDTO(){}
	
	public List<InforSlots> getInforSlots() {
		return inforSlots;
	}

	public void setInforSlots(List<InforSlots> inforSlots) {
		this.inforSlots = inforSlots;
	}

	private List<InforSlots> inforSlots;
}
