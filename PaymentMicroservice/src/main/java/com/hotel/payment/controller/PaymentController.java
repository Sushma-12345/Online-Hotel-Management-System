package com.hotel.payment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hotel.payment.details.PaymentDetails;
import com.hotel.payment.repo.PaymentRepo;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	 @Autowired
	    private PaymentRepo PaymentRepository;

	    @GetMapping(value = "/list")
	    public List<PaymentDetails> getAllProfiles(){
	        return PaymentRepository.findAll();
	    }
	    @PostMapping(value = "/add")
	    public PaymentDetails addNewCustomerProfile(@RequestBody PaymentDetails up){
	        return PaymentRepository.save(up);
	    }
	    @DeleteMapping(value = "/delete/{membercode}")
	    public void deleteProfile(@PathVariable String membercode) {
	        System.out.println("Delete method called");
	        PaymentRepository.deleteById(membercode);
	    }
	    @PutMapping(value="/update/{membercode}")
	    public PaymentDetails updateProfile(@PathVariable PaymentDetails membercode) {
	    	 System.out.println("Update method called");
	    	return PaymentRepository.save(membercode);
}
	    
}