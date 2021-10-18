package com.hotel.staff.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hotel.staff.details.StaffDetails;

public interface StaffRepo extends  MongoRepository<StaffDetails, String> {
	
}


