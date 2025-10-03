package com.ofss.digx.cz.bandhan.app.payout.maintenance.dto;

import java.io.Serializable;

public class CustInfoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public String custType;
	public String custTypeName;

	
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public String getCustTypeName() {
		return custTypeName;
	}
	public void setCustTypeName(String custTypeName) {
		this.custTypeName = custTypeName;
	}
	
	
}
