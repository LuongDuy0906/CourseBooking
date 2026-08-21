package com.example.course_booking_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course_booking_server.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
