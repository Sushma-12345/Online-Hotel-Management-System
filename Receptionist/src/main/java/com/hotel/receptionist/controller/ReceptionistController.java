package com.hotel.receptionist.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.hotel.receptionist.repo.ReservationRepo;
import com.hotel.receptionist.reservation.ReservationDetails;



//-----------------------------------------------------------------------------------
@RestController
@RequestMapping("/check")
public class ReceptionistController {
	@Autowired
	 RestTemplate restTemplate;

    @Autowired
    private ReservationRepo reservationRepository;
    
    
    

    @GetMapping(value = "/list")
    public List<ReservationDetails> getAllReservation()
    {
    	return Arrays.asList(restTemplate.getForObject("http://reservationmicroservice/reservation/list",ReservationDetails[].class));
    }
    
   
    
//    
//    
//    
//    @DeleteMapping("/delete/{code}")
//    public ResponseEntity deleteloans(@PathVariable("code") String type )
//    {
//    reservationRepository.deleteById(type);
//    	
//    	return new ResponseEntity<String>("Loan deleted Successfully",HttpStatus.OK);
//    }
//    		    
//    
//    
//    
//    @PutMapping("update")
//	public ResponseEntity<?> updpass(@RequestBody ReservationDetails res)
//	{
//		
//    	Optional<ReservationDetails> opt=reservationRepository.findById(res.getCode());
//    	System.out.println(opt);
//    	if(opt.isPresent())
//    	{
//    		ReservationDetails reservation = opt.get();
//    				reservation.setCheckindate(res.getCheckindate());
//    				reservation.setCheckoutdate(res.getCheckoutdate());
//    				reservation.setNoofadults(res.getNoofadults());
//    				reservation.setNoofchildrens(res.getNoofchildrens());
//    				reservation.setNoofnights(res.getNoofnights());
//    				reservation.setStatus(res.getStatus());
//    				reservation.setCode(res.getCode());
//    				reservationRepository.save(reservation);
//    				return new ResponseEntity<ReservationDetails>(reservation,HttpStatus.OK);
//    	}
//    	else
//    	{
//    		return new ResponseEntity<String>("notmodified",HttpStatus.CONFLICT);
//    	}
//		
//     }		
}

	
	
	
	

	