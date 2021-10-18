package com.hotel.setrates.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hotel.setrates.details.SetRatesDetails;



public interface SetRatesRepo extends  MongoRepository<SetRatesDetails, String> {
	
}
