package com.aletech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aletech.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {
	
}
