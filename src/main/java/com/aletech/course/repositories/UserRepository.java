package com.aletech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aletech.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {
	
}
