package com.GRP13.ETour.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.GRP13.ETour.Models.Tours;


@Repository
public interface ToursRepository extends JpaRepository<Tours,Integer>{

	@Modifying(clearAutomatically = true)
	@Transactional
	@Query("UPDATE Tours t SET filled_seats = filled_seats+ :seats WHERE t.tour_id= :tour_id")
	public void addSeat(@Param("seats") int seats , @Param("tour_id") int tour_id );
}


