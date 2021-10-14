package com.hotel.reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hotel.reservation.details.ReservationDetails;
import com.hotel.reservation.repo.ReservationRepo;

public class ReservationController {
	@RestController
	@RequestMapping("/Reservation")
	public class GuestController {
		 @Autowired
		    private ReservationRepo ReservationRepository;

		    @GetMapping(value = "/list")
		    public List<ReservationDetails> getAllReservation(){
		        return  ReservationRepository.findAll();
		    }
		    @PostMapping(value = "/add")
		    public ReservationDetails addNewReservationDetails(@RequestBody ReservationDetails up){
		        return  ReservationRepository.save(up);
		    }
}

}
