package com.myproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myproject.dto.EnterpriseDTO;
import com.myproject.service.EnterpriseService;

@Controller
public class EnterpriseController {

	@Autowired
	private EnterpriseService service;
	
	// 기업 목록 보기
	@RequestMapping("elist")
	public String selectEnterpriseList(Model model) {
		
		List<EnterpriseDTO> elist = service.selectEnterpriseList();
		model.addAttribute("elist", elist);
		
		return "enterprises/enterpriseList";
		
	} // end enterprisesList method
	
} // end EnterpriseController class
