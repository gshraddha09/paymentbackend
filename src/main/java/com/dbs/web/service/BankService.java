package com.dbs.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dbs.web.beans.Bank;
import com.dbs.web.beans.Customer;
import com.dbs.web.repository.BankRepository;

@Service
public class BankService {
	@Autowired
	private BankRepository bankrepo;
public Bank getBank(String id) {
		
		return bankrepo.findById(id).get();
}
}
