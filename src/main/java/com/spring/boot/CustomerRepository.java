package com.spring.boot;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	@Query (value ="SELECT * FROM Customer WHERE userName = ?1",nativeQuery = true)
	Customer CheckPassword(String userId);
}


