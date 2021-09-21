package com.dbs.web.rest;


import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.web.beans.Customer;
import com.dbs.web.service.CustomerService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerRestController {
	@Autowired
	private CustomerService customerservice;
	
	@GetMapping("/customer/{cid}")    
    public Customer getCustomer(@PathVariable String cid)         
    {        
         return customerservice.getCustomer(cid);     
                 
        }

	@PostMapping("/customer")    
    public Customer addCustomer(@RequestBody Customer cust)         
    {        
         return customerservice.addCustomer(cust);     
                 
        }
	@PutMapping("/customer/{cid}")    
    public Customer updateCustomer(@PathVariable String cid,@RequestBody Customer cust)         
    {        
         return customerservice.updateCustomer(cid,cust);     
                 
        }
	
	
	
	         
}
	
	
	
	
	
	
	
    

