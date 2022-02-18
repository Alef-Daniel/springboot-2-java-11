package com.aletech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aletech.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {
	
}
