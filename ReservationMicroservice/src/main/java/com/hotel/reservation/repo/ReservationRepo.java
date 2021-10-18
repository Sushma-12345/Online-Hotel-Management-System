package com.hotel.reservation.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hotel.reservation.details.ReservationDetails;

public interface ReservationRepo extends  MongoRepository<ReservationDetails, String> {
	
}
