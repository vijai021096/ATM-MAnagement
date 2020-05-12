package com.vijai.ATM.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.vijai.ATM.Entity.Account;
import com.vijai.ATM.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
