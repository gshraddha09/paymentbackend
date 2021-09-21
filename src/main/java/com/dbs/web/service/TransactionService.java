package com.dbs.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.web.beans.Transaction;
import com.dbs.web.repository.TransactionRepository;

@Service
public class TransactionService {
	@Autowired
	private TransactionRepository transactionrepository;
	public List< Transaction>getAllBycustomerid(String customerid)
	{
		return this.transactionrepository.findAllByCustomerid(customerid);
	}
//	public String getAllBycustomerid(String id)
//	{
//		return  this.transactionrepository.findAll(id).toString();
//	}

//	public Transaction getBycustomerId(String  customerid) {
//		// TODO Auto-generated method stub
//		return transactionrepository.
	public int postTransaction(Transaction tran) {
		if(this.transactionrepository.findById(tran.getTransactionid()).isPresent())
			return -1;
		try {
			return this.transactionrepository.save(tran).getTransactionid();
		}
		catch(IllegalArgumentException e)
		{
			return -1;
		}
		
		
		
		
		
		// TODO Auto-generated method stub
		
	}

}
