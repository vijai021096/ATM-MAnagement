package com.vijai.ATM.Repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.domain.Page;




import com.vijai.ATM.Entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {


	 @RestResource(path="UserId")                                  //To override the rest end point of query method.In default it will the name of the method.
	Page<Account> findByUserId(@Param("id")Long id,Pageable page); 
	
}
