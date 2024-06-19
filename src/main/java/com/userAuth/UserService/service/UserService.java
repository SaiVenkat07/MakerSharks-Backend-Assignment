package com.userAuth.UserService.service;


import com.userAuth.UserService.domain.User;
import com.userAuth.UserService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void registerUser(User user) {
        userRepository.save(user);
    }

    public Optional<User> fetchUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
