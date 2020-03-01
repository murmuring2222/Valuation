package com.myproject.service;

import java.util.List;

import com.myproject.dto.EnterpriseDTO;

public interface EnterpriseService {
	
	// 업종 코드 가져오기
	public List<EnterpriseDTO> selectIndustryCodeList();
	
	// 기업 등록
	public int insertEnterprise(int enterprise_code, String enterprise_name, String industry_name);
	
	// 기업 목록 보기
	public List<EnterpriseDTO> selectEnterpriseList();

} // end EnterpriseService interface
