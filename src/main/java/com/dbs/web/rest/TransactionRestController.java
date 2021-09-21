package com.dbs.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.web.beans.Transaction;
import com.dbs.web.service.TransactionService;
@RestController
@CrossOrigin(origins = "http://localhost:4200")


public class TransactionRestController {
	@Autowired
	private TransactionService transactionservice;
//	
	@GetMapping("/transaction/{customerid}")
	public List<Transaction> getAllByCustomerid(@PathVariable String customerid)
	{
		return this.transactionservice.getAllBycustomerid(customerid);
	}
	
	
	@PostMapping("/transaction")
    public ResponseEntity<String> postTransaction(@RequestBody Transaction tran){
        int id = this.transactionservice.postTransaction(tran);
        System.out.println(id);
        if( id != -1)
            return  ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body("Transaction inserted with id "+id);
        return  ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body("Transaction not inserted");
    }
}

