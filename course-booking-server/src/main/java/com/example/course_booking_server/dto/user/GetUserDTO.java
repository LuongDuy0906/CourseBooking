package com.example.course_booking_server.dto.user;

import com.example.course_booking_server.model.User;

public class GetUserDTO{
    private String email;

    GetUserDTO(User user){
        this.email = user.getEmail();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
