package com.spring.boot;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface HotelRepository extends CrudRepository<Hotel, Integer> {
	
}


