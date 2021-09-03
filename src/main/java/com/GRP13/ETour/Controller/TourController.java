package com.GRP13.ETour.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GRP13.ETour.Models.Tours;
import com.GRP13.ETour.Service.TourService;

@RestController
public class TourController {

	@Autowired
	private TourService tourserv;
	
	@GetMapping("/Tour")
	public List<Tours> getAllEmployees(){
		return tourserv.getTour();
	}		
	

	@GetMapping(value="/Tour/{tour_id}")
	public Tours getTour(@PathVariable int tour_id) {
		Tours tour= tourserv.getTour(tour_id);
		return tour;
		
	}

	@PostMapping(value="Tour/add")
	public void addTour(@RequestBody Tours tour)
	{
		tourserv.addTour(tour);
	}
	
	@DeleteMapping(value="Tour/delete/{tour_id}")
	public void deleteTour(@PathVariable int tour_id) {
		tourserv.deleteTour(tour_id);
		
	}
	
	@PutMapping(value="Tour/{seats}/{tour_id}")
	public void addSeat(@PathVariable int seats, @PathVariable int tour_id) {
		tourserv.addSeat(seats, tour_id);
		
	}
}