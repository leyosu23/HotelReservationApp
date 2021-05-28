package com.spring.boot;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ReservationRepository extends CrudRepository<Reservation, Integer> {
	@Query (value ="SELECT * FROM Reservation WHERE custId = ?1",nativeQuery = true)
	Reservation CheckcustId(Integer custId);
	
}


