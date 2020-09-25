package com.sns.service;

import com.sns.bean.Candidate_Detail;

public interface IApplyService {
	public int addCandidate_Detail(Candidate_Detail c);
	public Candidate_Detail getOneCandidate_Detail(int applyId);

}
