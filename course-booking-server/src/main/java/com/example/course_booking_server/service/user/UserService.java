package com.example.course_booking_server.service.user;

import org.springframework.stereotype.Service;

import com.example.course_booking_server.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Transactional
    public void createUser(){
        userRepo.save(null);
    }
}
