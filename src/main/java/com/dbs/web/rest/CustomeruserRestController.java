package com.dbs.web.rest;


import javax.persistence.EntityNotFoundException;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 

import com.dbs.web.beans.Customer;
import com.dbs.web.beans.Customeruser;
import com.dbs.web.beans.Customeruser;
import com.dbs.web.beans.Transaction;
import com.dbs.web.service.CustomerUserService;
import com.dbs.web.service.TransactionService;

 

@RestController
@CrossOrigin()
@RequestMapping("/user")
public class CustomeruserRestController {
    @Autowired
    private CustomerUserService custUserService;
    
    @PostMapping
    public ResponseEntity<Object> checkUser(@RequestBody Customeruser user) {
        Object customer;
        if ((customer = this.custUserService.checkUser(user)) != null) {
           return ResponseEntity.status(HttpStatus.OK).body(customer);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(1);
        }
    }

 

}