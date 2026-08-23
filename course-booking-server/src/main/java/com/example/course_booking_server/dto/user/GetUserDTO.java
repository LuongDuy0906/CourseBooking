package com.example.course_booking_server.dto.user;

import com.example.course_booking_server.model.User;

public class GetUserDTO {
    private String phone;

    public GetUserDTO(User user) {
        this.phone = user.getPhone();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
