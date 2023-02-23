package com.example.appolo1.Service.Services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    OrderService getOrder(Long id);
    List<OrderService> getOrders();
    void saveOrder(OrderService order);
    void updateOrder(OrderService order);
}
