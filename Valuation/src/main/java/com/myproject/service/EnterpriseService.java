package com.myproject.service;

import java.util.List;

import com.myproject.dto.EnterpriseDTO;

public interface EnterpriseService {
	
	// 기업 목록 보기
	public List<EnterpriseDTO> selectEnterpriseList();

} // end EnterpriseService interface
