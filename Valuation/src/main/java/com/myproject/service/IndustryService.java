package com.myproject.service;

import java.util.List;

import com.myproject.dto.TypeOfIndustriesDTO;

public interface IndustryService {

	// 업종 목록 보기
	public List<TypeOfIndustriesDTO> selectIndustryList();
	
} // end IndustryService interface
