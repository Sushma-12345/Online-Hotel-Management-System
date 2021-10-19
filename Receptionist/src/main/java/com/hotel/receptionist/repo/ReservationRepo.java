package com.hotel.receptionist.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hotel.receptionist.reservation.ReservationDetails;
public interface ReservationRepo extends  MongoRepository<ReservationDetails, String> {
	
}
