package com.dbs.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dbs.web.beans.Bank;
@Repository
public interface BankRepository  extends JpaRepository<Bank,String>{

}
