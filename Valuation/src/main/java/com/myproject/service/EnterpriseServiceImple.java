package com.myproject.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.dto.EnterpriseDTO;
import com.myproject.mapper.EnterpriseMapper;

@Service
public class EnterpriseServiceImple implements EnterpriseService {
	
	@Autowired
	private EnterpriseMapper mapper;
	
	// 업종 코드 가져오기
	@Override
	public List<EnterpriseDTO> selectIndustryCodeList() {
		
		return mapper.selectIndustryCodeList();
		
	} // end selectIndustryCodeList method
	
	// 기업 등록 
	@Override
	public int insertEnterprise(int enterprise_code, String enterprise_name, String industry_name) {
		
		HashMap<String, Object> hm = new HashMap<>();
		hm.put("enterprise_code", enterprise_code);
		hm.put("enterprise_name", enterprise_name);
		hm.put("industry_name", industry_name);
		
		return mapper.insertEnterprise(hm);
		
	} // end insertEnterprise method

	// 기업 목록 보기
	@Override
	public List<EnterpriseDTO> selectEnterpriseList() {
		
		return mapper.selectEnterpriseList();
		
	} // end enterpriseList method
	
} // end EnterpriseServiceImple class
