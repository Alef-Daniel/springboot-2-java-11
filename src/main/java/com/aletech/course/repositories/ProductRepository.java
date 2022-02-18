package com.aletech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aletech.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {
	
}
