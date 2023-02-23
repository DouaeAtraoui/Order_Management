package com.example.appolo1.Repository;

import com.example.appolo1.Entity.Order;
import com.example.appolo1.Entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RequestRepository extends JpaRepository<Request,Long> {
    List<Request> findByStatus(String status);
}
