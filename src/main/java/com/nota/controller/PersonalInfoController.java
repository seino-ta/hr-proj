package com.nota.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nota.entity.PersonalInfo;
import com.nota.service.PersonalInfoService;

@RestController
@RequestMapping("/personal_info")
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
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<PersonalInfo> index() {
		return personalInfoService.findAll();
	}

}
