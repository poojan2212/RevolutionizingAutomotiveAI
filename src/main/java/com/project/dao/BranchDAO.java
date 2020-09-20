package com.project.dao;

import java.util.List;

import com.project.model.BranchVO;

public interface BranchDAO {
	
	public void insertBranch(BranchVO branchVO);
	public List viewBranch();
	public List deleteBranch(BranchVO branchVO);
	public List editBranch(BranchVO branchVO);
	public void updateBranch(BranchVO branchVO);
	public List dropdownBranchByLocation(BranchVO branchVO);
}
