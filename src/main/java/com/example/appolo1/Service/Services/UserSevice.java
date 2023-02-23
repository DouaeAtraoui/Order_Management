package com.example.appolo1.Service.Services;

import com.example.appolo1.Entity.Order;
import com.example.appolo1.Entity.Request;
import com.example.appolo1.Entity.Reservation;
import com.example.appolo1.Entity.User;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface UserSevice {
    User consultUser(Long id);
    void addUser(User user);
    List<User> consultAllUsers();
    void updateUser(User user);
}