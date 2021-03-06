package com.GRP13.ETour.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.GRP13.ETour.Models.Login;
import com.GRP13.ETour.Models.Passenger;
import com.GRP13.ETour.Repository.LoginRepository;
import com.GRP13.ETour.Repository.PassengerRepository;

@Service
public class PassengerService {
	
	@Autowired
	private PassengerRepository passengerRepo;
	
	public void addPassenger(Passenger passenger) {
		passengerRepo.save(passenger);
		
	}
	

}
