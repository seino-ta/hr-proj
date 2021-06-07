package com.nota.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nota.entity.PersonalInfo;
import com.nota.service.PersonalInfoService;

@Controller
@RequestMapping("personal_info")
public class PersonalInfoController {
	/**
	 * 個人情報 Service
	 */
	@Autowired
	PersonalInfoService personalInfoService;

	/**
	 * 個人情報一覧画面を表示
	 * 
	 * @param model Model
	 * @return 個人情報一覧画面
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		List<PersonalInfo> personalInfo = personalInfoService.findAll();
        model.addAttribute("persons", personalInfo); 
        return "personal_info/list";
	}

}
