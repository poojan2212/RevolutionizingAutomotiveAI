package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.LoginDAO;
import com.project.model.LoginVO;

@Service
public class LoginService {
	
	@Autowired
	LoginDAO loginDAO;
	
	@Transactional
	public void insert(LoginVO loginVO)
	{
		loginDAO.insert(loginVO);
	}
	
	@Transactional
	public void delete(LoginVO loginVO)
	{
		loginDAO.delete(loginVO);
	}
	
	@Transactional
	public List searchByUserName(String username)
	{
		List loginlist=this.loginDAO.searchByUserName(username);
		return loginlist;
	}
	
	
	@Transactional
	public List searchstep1(LoginVO loginVO)
	{
		List ls = this.loginDAO.searchstep1(loginVO);
		return ls;
	}
	
	@Transactional
	public void updatePassword(LoginVO loginVO)
	{
		this.loginDAO.updatePassword(loginVO);
	}
	
}
