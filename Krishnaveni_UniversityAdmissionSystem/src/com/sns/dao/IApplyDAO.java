package com.sns.dao;

import com.sns.bean.Candidate_Detail;

public interface IApplyDAO {
	
          public int addCandidate_Detail(Candidate_Detail c);
          public Candidate_Detail getOneCandidate_Detail(int applyId);

}
