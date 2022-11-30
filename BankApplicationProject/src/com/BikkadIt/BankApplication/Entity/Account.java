package com.BikkadIt.BankApplication.Entity;

public class Account {
	   long AccountNo;
	   String Fullname;
	   String Email;
	   String Password;
	   String Address;
	   String Mobno;
	   String Dob;
	   String PanNo;
	    double Balance;
	
	    
	    
	    
	    public long getAccountNo() {
			return AccountNo;
		}
		public void setAccountNo(long accountNo) {
			AccountNo = accountNo;
		}
		public String getFullname() {
			return Fullname;
		}
		public void setFullname(String fullname) {
			Fullname = fullname;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public String getMobno() {
			return Mobno;
		}
		public void setMobno(String mobno) {
			Mobno = mobno;
		}
		public String getDob() {
			return Dob;
		}
		public void setDob(String dob) {
			Dob = dob;
		}
		public String getPanNo() {
			return PanNo;
		}
		public void setPanNo(String panNo) {
			PanNo = panNo;
		}
		public double getBalance() {
			return Balance;
		}
		public void setBalance(double balance) {
			Balance = balance;
		}
		@Override
		public String toString() {
			return "Account [AccountNo=" + AccountNo + ", Fullname=" + Fullname + ", Email=" + Email + ", Password="
					+ Password + ", Address=" + Address + ", Mobno=" + Mobno + ", Dob=" + Dob + ", PanNo=" + PanNo
					+ ", Balance=" + Balance + "]";
		}
		
		
		
	    
	    
	    
	    

}
