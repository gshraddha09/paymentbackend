package com.dbs.web.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dbs.web.beans.Transaction;
@Repository
public interface TransactionRepository extends CrudRepository<Transaction,Integer>{

	List<Transaction> findAllByCustomerid(String id);

	//

	

	
}
