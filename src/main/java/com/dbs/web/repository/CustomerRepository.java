package com.dbs.web.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dbs.web.beans.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,String>{
	// public List<Customer>findAllCustomers(List<Customer> customers);
	

}
