package com.vijai.ATM.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.vijai.ATM.Entity.Account;
import com.vijai.ATM.Entity.Transactions;

public interface TransactionInterface extends JpaRepository<Transactions,Long>{

	 @RestResource(path="AccountId")                                  //To override the rest end point of query method.In default it will the name of the method.
		Page<Transactions> findByAccountId(@Param("id")Long id,Pageable page); 
}
