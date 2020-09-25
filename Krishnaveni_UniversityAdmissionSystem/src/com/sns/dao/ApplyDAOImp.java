package com.sns.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.sns.bean.Candidate_Detail;

public class ApplyDAOImp implements IApplyDAO {
	
	Connection conn;

	public ApplyDAOImp() {

		conn = DBUtil.getDBConnection();
	}


	@Override
	public int addCandidate_Detail(Candidate_Detail c) {
		// TODO Auto-generated method stub
		
		String insertQuery ="insert into Candidate_Detail(applyId,Firstname,Lastname,ContactNo,email,aggregate,stream)values(?,?,?,?,?,?,?)";
	     int n = 0;
	       
	     try {
			PreparedStatement pstmt = conn.prepareStatement(insertQuery);
			  pstmt.setInt(1,c.getApplyId());
			  pstmt.setString(2, c.getFirstname());
			  pstmt.setString(3, c.getLastname());
			  pstmt.setLong(4, c.getContactNo());
			  pstmt.setString(5, c.getEmail());
			  pstmt.setDouble(6, c.getAggregate());
			  pstmt.setString(7, c.getStream());
			  
			  n = pstmt.executeUpdate();
			  
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}

	@Override
	public Candidate_Detail getOneCandidate_Detail(int applyId) {
		
		  Candidate_Detail Candidate_Detail = null;
		  String selectQuery = "select * from Candidate_Detail where applyId = ?";
		  
		  PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(selectQuery);
			pstmt.setInt(1,applyId);
			  ResultSet res = pstmt.executeQuery();
			  res.next();
			  int applyId1 = res.getInt("applyId");
			  String Firstname = res.getString("Firstname");
			  String Lastname = res.getString("Lastname");
			  long ContactNo = res.getLong("ContactNo");
			  String email = res.getString("email");
			  double Aggregate = res.getDouble("Aggregate");
			  String Stream = res.getString("Stream");
			  
			  Candidate_Detail = new Candidate_Detail();
			  Candidate_Detail.setApplyId(applyId1);
			  Candidate_Detail.setFirstname(Firstname);
			  Candidate_Detail.setLastname(Lastname);
			  Candidate_Detail.setContactNo(ContactNo);
			  Candidate_Detail.setEmail(email);
			  Candidate_Detail.setAggregate(Aggregate);
			  Candidate_Detail.setStream(Stream);
			  		  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return Candidate_Detail;
	}

}
