package com.dbs.web.service;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.web.beans.Customeruser;
import com.dbs.web.repository.CustomerUserRepository;
@Service
public class LoginService {
	 @Autowired
	    CustomerUserRepository repo;
	public Customeruser getAllBycustomerId(int un) {
		
	    try { 
            Optional<Customeruser> c=this.repo.findById(un);
            return c.orElseThrow(()->{
                return new EntityNotFoundException("Bank with "+un + " does not exist");
            });
            }
        catch(IllegalArgumentException iae) {
            return null;
        }
        }
		// TODO Auto-generated method stub
		

}
