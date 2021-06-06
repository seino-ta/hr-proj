package com.nota.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nota.entity.PersonalInfo;
import com.nota.repository.PersonalInfoRepository;

/**
 * 個人情報 Service
 */
@Repository
public class PersonalInfoService {
	/**
	 * 個人情報 Repository
	 */
	@Autowired
	PersonalInfoRepository personalInfoRepository;

	/**
	 * 個人情報 全検索
	 * 
	 * @return 検索結果
	 */
	public List<PersonalInfo> findAll() {
		return personalInfoRepository.findAll();
	}
}
