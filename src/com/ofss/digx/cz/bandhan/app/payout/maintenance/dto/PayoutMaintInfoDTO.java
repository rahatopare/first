package com.ofss.digx.cz.bandhan.app.payout.maintenance.dto;

import java.io.Serializable;

public class PayoutMaintInfoDTO implements Serializable {

	private static final long serialVersionUID = -425601652113854132L;
	
	public String customerType;
	public String productCode;
    public String productType;
    public String productName;
    public String productDescription;
    public String duration;
	public String maturityInstruction;  
	public String rateOfInterest;
    public String isPopular;
    
 
    public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
    public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getMaturityInstruction() {
		return maturityInstruction;
	}
	public void setMaturityInstruction(String maturityInstruction) {
		this.maturityInstruction = maturityInstruction;
	}
	public String getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(String rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public String getIsPopular() {
		return isPopular;
	}
	public void setIsPopular(String isPopular) {
		this.isPopular = isPopular;
	}

}
