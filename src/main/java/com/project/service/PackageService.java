package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import com.project.dao.PackageDAO;
import com.project.model.PackageVO;

@Service
public class PackageService {

	@Autowired
	PackageDAO packageDAO;
	
	@Transactional
	public void insertPackage(PackageVO packageVO)
	{
		packageDAO.insertPackage(packageVO);
	}
	
	@Transactional
	public List searchPackage(PackageVO packageVO)
	{
		List ls = packageDAO.searchPackage(packageVO);
		return ls;
	}

	@Transactional
	public void deletePackage(PackageVO packageVO)
	{
		packageDAO.deletePackage(packageVO);
	}

	@Transactional
	public List editPackage(PackageVO packageVO) 
	{
		
		List ls =packageDAO.editPackage(packageVO);
		return ls;
	}
	
	@Transactional
	public void updatePackage(PackageVO packageVO) 
	{
	
		packageDAO.updatePackage(packageVO);		
		
	}

}
