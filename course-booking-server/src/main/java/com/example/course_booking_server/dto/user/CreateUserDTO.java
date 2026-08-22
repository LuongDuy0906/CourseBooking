package com.example.course_booking_server.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class CreateUserDTO {
    @NotEmpty(message = "Email khong duoc de trong")
    @Email(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$", message = "Email khong hop le")
    private String email;

    @NotEmpty()
    private String password;

    public CreateUserDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
