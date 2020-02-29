package com.myproject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.myproject.dto.TypeOfIndustriesDTO;

@Mapper
public interface IndustryMapper {
	
	// 기업 목록 보기
	public List<TypeOfIndustriesDTO> selectIndustryList();

} // end IndustryMapper interface
