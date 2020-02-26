package com.myproject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.myproject.dto.EnterpriseDTO;

@Mapper
public interface EnterpriseMapper {

	public List<EnterpriseDTO> selectEnterpriseList();
	
} // end EnterpriseMapper interface
