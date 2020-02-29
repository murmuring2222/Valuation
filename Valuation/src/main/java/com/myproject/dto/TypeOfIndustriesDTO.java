package com.myproject.dto;

public class TypeOfIndustriesDTO {

	private int industryCode; // 업종 코드
	private String industryName; // 업종명

	public TypeOfIndustriesDTO(int industryCode, String industryName) {
		this.industryCode = industryCode;
		this.industryName = industryName;
	} // Constructor

	public TypeOfIndustriesDTO() {

	} // no argument Constructor

	public int getIndustryCode() {
		return industryCode;
	}

	public void setIndustryCode(int industryCode) {
		this.industryCode = industryCode;
	}

	public String getIndustryName() {
		return industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

} // end TypeOfIndustiresDTO class
