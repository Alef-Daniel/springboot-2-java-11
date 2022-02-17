package com.aletech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aletech.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {
	
}
