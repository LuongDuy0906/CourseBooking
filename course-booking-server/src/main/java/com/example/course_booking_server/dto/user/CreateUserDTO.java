package com.example.course_booking_server.dto.user;

import jakarta.validation.constraints.NotEmpty;

public class CreateUserDTO {
    @NotEmpty(message = "Email khong duoc de trong")
    private String phone;

    @NotEmpty()
    private String password;

    public CreateUserDTO(String phone, String password) {
        this.phone = phone;
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
