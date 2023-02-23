package com.example.appolo1.Service.ServiceImpl;

import com.example.appolo1.Entity.Order;
import com.example.appolo1.Entity.Request;
import com.example.appolo1.Entity.Reservation;
import com.example.appolo1.Entity.User;
import com.example.appolo1.Repository.UserRepository;
import com.example.appolo1.Service.Services.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImple implements UserSevice {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User consultUser(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> consultAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void updateUser(User user) {
        User existingUser = userRepository.findById(user.getId()).orElse(null);
        if (existingUser != null) {
            existingUser.setStatus(user.getStatus());
            existingUser.setEmail(user.getEmail());
            existingUser.setPassword(user.getPassword());
            userRepository.save(existingUser);
        }
    }

}
