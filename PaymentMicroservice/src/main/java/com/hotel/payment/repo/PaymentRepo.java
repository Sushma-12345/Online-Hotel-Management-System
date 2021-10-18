package com.hotel.payment.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hotel.payment.details.PaymentDetails;


public interface PaymentRepo extends  MongoRepository<PaymentDetails, String> {
	
}
