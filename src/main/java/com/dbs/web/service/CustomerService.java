package com.dbs.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.web.beans.Customer;
import com.dbs.web.repository.CustomerRepository;

	

@Service
public class CustomerService  {

	@Autowired
	CustomerRepository customerRepo;
	
	
	public Customer addCustomer(Customer customer) {
		
		return customerRepo.save(customer);
	
	}

	
	public Customer getCustomer(String id) {
		
		return customerRepo.findById(id).get();
		
	}

	public Customer updateCustomer(String id, Customer customer) {
		Optional<Customer> result=customerRepo.findById(id);
	
			return customerRepo.save(customer);
	
	}

	
	public Customer deleteCustomer(String id) {
		Optional<Customer> result=customerRepo.findById(id);
		
			customerRepo.deleteById(id);
			return result.get();
	}
	
}