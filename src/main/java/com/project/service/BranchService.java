package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.BranchDAO;
import com.project.dao.LocationDAO;
import com.project.model.BranchVO;
import com.project.model.LocationVO;


@Service
public class BranchService {

	@Autowired BranchDAO branchDAO;
	
	@Transactional
	public void insertBranch(BranchVO branchVO){
		branchDAO.insertBranch(branchVO);
	}
	
	@Transactional
	public List viewBranch(){
		List ls=branchDAO.viewBranch();
		return ls;
	}
	
	@Transactional
	public List deleteBranch(BranchVO branchVO){
		List ls = branchDAO.deleteBranch(branchVO);
		return ls;
	}
	
	@Transactional
	public List editBranch(BranchVO branchVO){
		List ls = branchDAO.editBranch(branchVO);
		return ls;
	}
	
	@Transactional
	public void updateBranch(BranchVO branchVO){
		branchDAO.updateBranch(branchVO);
	}
	
	@Transactional
	public List dropdownBranchByLocation(BranchVO branchVO)
	{
		List ls = this.branchDAO.dropdownBranchByLocation(branchVO);
		return ls;
	}
}
