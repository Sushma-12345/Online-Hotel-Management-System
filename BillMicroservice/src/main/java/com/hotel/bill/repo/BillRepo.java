package com.hotel.bill.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hotel.bill.details.BillDetails;
public interface BillRepo extends  MongoRepository<BillDetails, String> {
	
}
