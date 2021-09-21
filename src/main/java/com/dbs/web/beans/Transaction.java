package com.dbs.web.beans;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="transaction")
public class Transaction{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int transactionid;
private Date transferdate;
private String transfertype;

private String messagecode;
private String customerid;
private String receiveraccountholdernumber;
private String receiveraccountholdername;
private double inramount;
private String status;

private String bic;
public Transaction() {
	
}
public Transaction(int transactionid, Date transferdate, String transfertype, String messagecode, String customerid,
		String receiveraccountholdernumber, String receiveraccountholdername, double inramount, String status,
		String bic) {
	super();
	this.transactionid = transactionid;
	this.transferdate = transferdate;
	this.transfertype = transfertype;
	this.messagecode = messagecode;
	this.customerid = customerid;
	this.receiveraccountholdernumber = receiveraccountholdernumber;
	this.receiveraccountholdername = receiveraccountholdername;
	this.inramount = inramount;
	this.status = status;
	this.bic = bic;
}

public String getMessagecode() {
	return messagecode;
}
public void setMessagecode(String messagecode) {
	this.messagecode = messagecode;
}
public String getCustomerid() {
	return customerid;
}
public void setCustomerid(String customerid) {
	this.customerid = customerid;
}
public String getBic() {
	return bic;
}
public void setBic(String bic) {
	this.bic = bic;
}
public int getTransactionid() {
	return transactionid;
}
public void setTransactionid(int transactionid) {
	this.transactionid = transactionid;
}



public Date getTransferdate() {
	return transferdate;
}
public void setTransferdate(Date transferdate) {
	this.transferdate = transferdate;
}
public String getTransfertype() {
	return transfertype;
}
public void setTransfertype(String transfertype) {
	this.transfertype = transfertype;
}
public String getReceiveraccountholdernumber() {
	return receiveraccountholdernumber;
}
public void setReceiveraccountholdernumber(String receiveraccountholdernumber) {
	this.receiveraccountholdernumber = receiveraccountholdernumber;
}
public String getReceiveraccountholdername() {
	return receiveraccountholdername;
}
public void setReceiveraccountholdername(String receiveraccountholdername) {
	this.receiveraccountholdername = receiveraccountholdername;
}
public double getInramount() {
	return inramount;
}
public void setInramount(double inramount) {
	this.inramount = inramount;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

}








