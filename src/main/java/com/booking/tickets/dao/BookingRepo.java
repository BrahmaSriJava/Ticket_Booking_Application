package com.booking.tickets.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.booking.tickets.model.Ticket;

//This annotation is optional
@Repository
public interface BookingRepo extends CrudRepository<Ticket, Integer> {
	// save
	// findALl
	// findAllById
	// SaveAll
    //existsById
    //deleteById
    //deleteAll
   //count()

}
