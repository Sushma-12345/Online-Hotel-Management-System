package com.hotel.bill.controller;

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

import com.hotel.bill.details.BillDetails;
import com.hotel.bill.repo.BillRepo;
	@RestController
	@RequestMapping("/billing")
	public class BillController{
			    @Autowired
			    private BillRepo BillRepository;

			    @GetMapping(value = "/list")
			    public List<BillDetails> getAllReservation(){
			        return  BillRepository.findAll();
			    }
			    
			    @PostMapping(value = "/add")
			    public BillDetails addNewBillDetails(@RequestBody BillDetails up){
			        return BillRepository.save(up);
			    }
			    
			    @DeleteMapping(value = "/delete/{code}")
			    public void deleteBill(@PathVariable String code) {
			        System.out.println("Delete method called");
			        BillRepository.deleteById(code);
			    }
			    
			    @PutMapping(value="/update/{code}")
			    public BillDetails updateBill(@PathVariable BillDetails code) {
			    	 System.out.println("Update method called");
			    	return BillRepository.save(code);
	}
	}

