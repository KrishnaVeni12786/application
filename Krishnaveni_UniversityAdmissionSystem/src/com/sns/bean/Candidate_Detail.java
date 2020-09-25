package com.sns.bean;

public class Candidate_Detail {
	
		private int applyId;
		private String Firstname;
		private String Lastname;
		private long ContactNo;
		private String email;
		private Double aggregate;
		private String stream;
		
		
		public int getApplyId() {
			return applyId;
		}
		public void setApplyId(int applyId) {
			this.applyId = applyId;
		}
		public String getFirstname() {
			return Firstname;
		}
		public void setFirstname(String firstname) {
			this.Firstname = firstname;
		}
		public String getLastname() {
			return Lastname;
		}
		public void setLastname(String lastname) {
			Lastname = lastname;
		}
		public long getContactNo() {
			return ContactNo;
		}
		public void setContactNo(long contactNo) {
			this.ContactNo = contactNo;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Double getAggregate() {
			return aggregate;
		}
		public void setAggregate(Double aggregate) {
			this.aggregate = aggregate;
		}
		public String getStream() {
			return stream;
		}
		public void setStream(String stream) {
			this.stream = stream;
		}
		@Override
		public String toString() {
			return "Candidate_Detail[applyId=" + applyId + ", Firstname=" + Firstname + ", Lastname=" + Lastname
					+ ", ContactNo=" + ContactNo + ", email=" + email + ", aggregate=" + aggregate + ", stream=" + stream
					+ "]";
		}

}
