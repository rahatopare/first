package com.ofss.digx.cz.bandhan.app.payout.maintenance.dto;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ofss.digx.service.response.BaseResponseObject;

public class SearchPayoutMaintResponseDTO extends BaseResponseObject{
	
	
	private static final long serialVersionUID = 7797730324952704111L;

	/**
	 * Attribute to hold the component name.
	 */
	private static final String THIS_COMPONENT_NAME = SearchPayoutMaintResponseDTO.class.getName();

	private static transient Logger logger = LoggerFactory.getLogger(THIS_COMPONENT_NAME);

	
	public List<PayoutMaintInfoDTO> payOutMaintInfo;


	public List<PayoutMaintInfoDTO> getPayOutMaintInfo() {
		return payOutMaintInfo;
	}


	public void setPayOutMaintInfo(List<PayoutMaintInfoDTO> payOutMaintInfo) {
		this.payOutMaintInfo = payOutMaintInfo;
	}


}
