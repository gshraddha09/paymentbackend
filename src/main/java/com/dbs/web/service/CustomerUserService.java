package com.dbs.web.service;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.web.beans.Customer;
import com.dbs.web.beans.Customeruser;
import com.dbs.web.repository.CustomerUserRepository;

 

@SuppressWarnings("unused")
@Service
public class CustomerUserService {
    Customeruser obj = new Customeruser();
    @Autowired
    private CustomerUserRepository custUserRepository;
    
    public List<Customeruser> getAllByName(String name) {
        List<Customeruser> user = new ArrayList<Customeruser>();
        this.custUserRepository.findAll().forEach(t -> user.add(t));
            return user.stream().filter(t -> t.getUsername().equals(name))
                    .collect(Collectors.toList());
       }
    
    public String checkUser(Customeruser c) {
        String uname = c.getUsername();
        String pass = c.getUserpassword();
        try {
            List<Customeruser> u = this.getAllByName(uname);
            Customeruser test = u.get(0);
            if (pass.equals(test.getUserpassword())) {
                return test.getCustomerid();
            }
        } catch(IndexOutOfBoundsException e) {
            return null;
        }
        return null;
        
    }

 

}