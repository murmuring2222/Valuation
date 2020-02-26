package com.myproject.dto;

public class EnterpriseDTO {

	private int enterpriseCode; // 기업 코드
	private String enterpriseName; // 기업명
	private int stockPrice; // 주가

	public EnterpriseDTO(int enterpriseCode, String enterpriseName, int stockPrice) {
		this.enterpriseCode = enterpriseCode;
		this.enterpriseName = enterpriseName;
		this.stockPrice = stockPrice;
	} // end Constructor

	public EnterpriseDTO() {
		
	} // end no argument Constructor

	public int getEnterpriseCode() {
		return enterpriseCode;
	}

	public void setEnterpriseCode(int enterpriseCode) {
		this.enterpriseCode = enterpriseCode;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public int getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}

} // end Enterprises class
