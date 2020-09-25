package com.sns.service;

import com.sns.bean.Candidate_Detail;

import com.sns.dao.ApplyDAOImp;
import com.sns.dao.IApplyDAO;

public class ApplyServiceImp implements IApplyService {
	
	IApplyDAO data = new ApplyDAOImp();

	@Override
	public int addCandidate_Detail(Candidate_Detail c) {
		// TODO Auto-generated method stub
		
		return data.addCandidate_Detail(c);
	
	}

	@Override
	public Candidate_Detail getOneCandidate_Detail(int applyId) {
		// TODO Auto-generated method stub
		return data.getOneCandidate_Detail(applyId);
	}
		
}
