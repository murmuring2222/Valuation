package com.myproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.dto.EnterpriseDTO;
import com.myproject.mapper.EnterpriseMapper;

@Service
public class EnterpriseServiceImple implements EnterpriseService {
	
	@Autowired
	private EnterpriseMapper mapper;

	// 기업 목록 보기
	public List<EnterpriseDTO> selectEnterpriseList() {
		
		return mapper.selectEnterpriseList();
		
	} // end enterpriseList method
	
} // end EnterpriseServiceImple class
