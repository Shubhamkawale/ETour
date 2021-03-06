package com.GRP13.ETour.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GRP13.ETour.Models.Booking;
import com.GRP13.ETour.Models.Tours;
import com.GRP13.ETour.Service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	private BookingService bookingserve;
	
	@PostMapping(value="Booking/add")
	public void addBooking(@RequestBody Booking booking)
	{
		bookingserve.addBooking(booking);
	}
	
	

}
