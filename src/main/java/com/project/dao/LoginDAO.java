package com.project.dao;

import java.util.List;

import com.project.model.LoginVO;

public interface LoginDAO {

	public void insert(LoginVO loginVO);
	public void delete(LoginVO loginVO);
	public List searchByUserName(String username);
	public List searchstep1(LoginVO loginVO);
	public void updatePassword(LoginVO loginVO);
	
	
}
