package com.example.course_booking_server.service.user;

import org.springframework.stereotype.Service;

import com.example.course_booking_server.common.constanst.UserRole;
import com.example.course_booking_server.dto.user.CreateUserDTO;
import com.example.course_booking_server.dto.user.GetUserDTO;
import com.example.course_booking_server.model.Profile;
import com.example.course_booking_server.model.User;
import com.example.course_booking_server.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Transactional
    public String createUser(CreateUserDTO dto) {
        boolean isExistUser = userRepo.findByPhone(dto.getPhone()).isPresent();

        if (isExistUser) {
            return "Email da ton tai";
        }

        User newUser = new User(dto.getPhone(), dto.getPassword(), UserRole.USER);
        Profile newProfile = new Profile();

        newUser.setProfile(newProfile);

        GetUserDTO newUserInfo = new GetUserDTO(userRepo.save(newUser));

        return "Tao thanh cong nguoi dung voi email: " + newUserInfo.getPhone();
    }
}
