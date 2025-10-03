package com.ofss.digx.cz.bandhan.app.payout.maintenance.dto;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ofss.digx.service.response.BaseResponseObject;

public class FetchCustomerTypeResponseDTO extends BaseResponseObject{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7797730324952704111L;

	/**
	 * Attribute to hold the component name.
	 */
	private static final String THIS_COMPONENT_NAME = FetchCustomerTypeResponseDTO.class.getName();

	private static transient Logger logger = LoggerFactory.getLogger(THIS_COMPONENT_NAME);

	
	public List<CustInfoDTO> custInfo;

	public List<CustInfoDTO> getCustInfo() {
		return custInfo;
	}
	
	public void setCustInfo(List<CustInfoDTO> listCustInfo) {
		this.custInfo = listCustInfo;
	}
	
}
