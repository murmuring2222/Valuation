package com.myproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.dto.TypeOfIndustriesDTO;
import com.myproject.mapper.IndustryMapper;

@Service
public class IndustryServiceImple implements IndustryService {

	@Autowired
	private IndustryMapper mapper;
	
	// 업종 목록 보기
	@Override
	public List<TypeOfIndustriesDTO> selectIndustryList() {
		
		return mapper.selectIndustryList();
		
	} // end selectIndustryList method
	
} // end IndustryServiceImpel class
