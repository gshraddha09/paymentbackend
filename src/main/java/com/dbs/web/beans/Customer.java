package com.dbs.web.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private String customerid;
	private String accountholdername;
	private int overdraftflag;
	private double clearbalance;
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getAccountholdername() {
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}
	public int getOverdraftflag() {
		return overdraftflag;
	}
	public void setOverdraftflag(int overdraftflag) {
		this.overdraftflag = overdraftflag;
	}
	public double getClearbalance() {
		return clearbalance;
	}
	public void setClearbalance(double clearbalance) {
		this.clearbalance = clearbalance;
	}
	

}
