package com.hotel.reservation.controller;

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
import com.hotel.reservation.details.ReservationDetails;
import com.hotel.reservation.repo.ReservationRepo;

@RestController
@RequestMapping("/reservation")
public class ReservationController{
		    @Autowired
		    private ReservationRepo reservationRepository;

		    @GetMapping(value = "/list")
		    public List<ReservationDetails> getAllReservation(){
		        return  reservationRepository.findAll();
		    }
		    
		    @PostMapping(value = "/add")
		    public ReservationDetails addNewReservationDetails(@RequestBody ReservationDetails up){
		        return  reservationRepository.save(up);
		    }
		    
		    @DeleteMapping(value = "/delete/{code}")
		    public void deleteReservation(@PathVariable String code) {
		        System.out.println("Delete method called");
		        reservationRepository.deleteById(code);
		    }
		    
		    @PutMapping(value="/update/{code}")
		    public ReservationDetails updateReservation(@PathVariable ReservationDetails code) {
		    	 System.out.println("Update method called");
		    	return reservationRepository.save(code);
}
	}
	