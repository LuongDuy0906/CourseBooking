package com.example.course_booking_server.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course_booking_server.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
