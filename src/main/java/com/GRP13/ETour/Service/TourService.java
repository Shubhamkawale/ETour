package com.GRP13.ETour.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GRP13.ETour.Models.Tours;
import com.GRP13.ETour.Repository.ToursRepository;

@Service
public class TourService {
	
	@Autowired
	private ToursRepository tourRepository;
	
	public List<Tours> getTour() {
		return tourRepository.findAll();
	}

	public void deleteTour(Integer tour_id) {
		tourRepository.deleteById(tour_id);
	}
	
	public Tours getTour(Integer tour_id) {
		return tourRepository.findById(tour_id).get();
		
	}
	
	public void addTour(Tours tour) {
		tourRepository.save(tour);
	}
		
}
