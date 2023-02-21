package com.example.appolo1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Order extends JpaRepository<Order,Long> {
}
