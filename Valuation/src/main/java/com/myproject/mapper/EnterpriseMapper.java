package com.myproject.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.myproject.dto.EnterpriseDTO;

@Mapper
public interface EnterpriseMapper {
	
	// 업종 코드 가져오기
	public List<EnterpriseDTO> selectIndustryCodeList();

	// 기업 등록
	public int insertEnterprise(HashMap<String, Object> hm);
	
	// 기업 목록 보기
	public List<EnterpriseDTO> selectEnterpriseList();
	
} // end EnterpriseMapper interface
