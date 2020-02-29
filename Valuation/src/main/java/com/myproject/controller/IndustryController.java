package com.myproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myproject.dto.TypeOfIndustriesDTO;
import com.myproject.service.IndustryService;

@Controller
public class IndustryController {

	@Autowired
	private IndustryService service;
	
	// 업종 목록 보기
	@RequestMapping("ilist")
	public String selectIndustryList(Model model) {
		
		List<TypeOfIndustriesDTO> ilist = service.selectIndustryList();
		model.addAttribute("ilist", ilist);
		
		return "/industries/industryList";
		
	} // end selectIndustryList method
	
} // end IndustryController class
