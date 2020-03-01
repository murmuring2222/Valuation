package com.myproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myproject.dto.EnterpriseDTO;
import com.myproject.service.EnterpriseService;

@Controller
public class EnterpriseController {

	@Autowired
	private EnterpriseService service;

	// 기업 메인
	@RequestMapping("enterprise")
	public String enterprise() {

		return "/enterprises/enterprise";

	} // end enterprise method

	// 기업 등록 페이지
	@RequestMapping("insertEnterprise")
	public String insertEnterprise(Model model) {
		
		List<EnterpriseDTO> iclist = service.selectIndustryCodeList();
		model.addAttribute("iclist", iclist);

		return "/enterprises/insertEnterprise";

	} // end insertEnterprise method

	// 기업 등록 결과
	@RequestMapping("insertEnterpriseResult")
	public String insertEnterpriseResult(
			@RequestParam(defaultValue = "0", required = false) int enterprise_code,
			@RequestParam(defaultValue = "", required = false) String enterprise_name, 
			@RequestParam(defaultValue = "", required = false) String industry_name) {
		service.insertEnterprise(enterprise_code, enterprise_name, industry_name);

		return "redirect:elist";

	} // end insertEnterprise method

	// 기업 목록 보기
	@RequestMapping("elist")
	public String selectEnterpriseList(Model model) {

		List<EnterpriseDTO> elist = service.selectEnterpriseList();
		model.addAttribute("elist", elist);

		return "enterprises/enterpriseList";

	} // end enterprisesList method

} // end EnterpriseController class
