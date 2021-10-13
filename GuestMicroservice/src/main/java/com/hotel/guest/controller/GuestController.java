package com.hotel.guest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.guest.details.GuestDetails;
import com.hotel.guest.repo.GuestRepo;

@RestController
	@RequestMapping("/guest")
	public class GuestController {
		 @Autowired
		    private GuestRepo GuestRepository;

		    @GetMapping(value = "/list")
		    public List<GuestDetails> getAllProfiles(){
		        return GuestRepository.findAll();
		    }
		    @PostMapping(value = "/add")
		    public GuestDetails addNewGuestDetails(@RequestBody GuestDetails up){
		        return GuestRepository.save(up);
		    }
}
