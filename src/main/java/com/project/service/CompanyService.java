package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.CompanyDAO;
import com.project.model.RegisterVO;


@Service
public class CompanyService {

	@Autowired
	CompanyDAO companyDAO;
	
	
	@Transactional
	public List searchCompany(RegisterVO registerVO)
	{
		List ls = companyDAO.viewCompany(registerVO);
		return ls;
	}

}
