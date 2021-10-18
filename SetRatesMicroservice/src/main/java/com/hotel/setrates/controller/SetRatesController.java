package com.hotel.setrates.controller;

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


import com.hotel.setrates.details.SetRatesDetails;
import com.hotel.setrates.repo.SetRatesRepo;


@RestController
@RequestMapping("/setrating")
public class SetRatesController {
	 @Autowired
	    private SetRatesRepo SetRatesRepository;
	 
	    @GetMapping(value = "/list")
	    public List<SetRatesDetails> getAllRates(){
	        return SetRatesRepository.findAll();
	    }
	    
	    @PostMapping(value = "/add")
	    public SetRatesDetails addNewRates(@RequestBody SetRatesDetails up){
	        return SetRatesRepository.save(up);
	    }
	    
	    @DeleteMapping(value = "/delete/{membercode}")
	    public void deleteRates(@PathVariable String membercode) {
	        System.out.println("Delete method called");
	        SetRatesRepository.deleteById(membercode);
	    }
	    
	    @PutMapping(value="/update/{membercode}")
	    public SetRatesDetails updateRates(@PathVariable SetRatesDetails membercode) {
	    	 System.out.println("Update method called");
	    	return SetRatesRepository.save(membercode);
	    }
}