package com.dbs.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.web.beans.Bank;
import com.dbs.web.service.BankService;
@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class BankRestController {
	@Autowired
	private BankService bankservice;
	@GetMapping("/bank/{bic}")
	public Bank getBank(@PathVariable String bic)
	{
		return bankservice.getBank(bic);
	}

}
