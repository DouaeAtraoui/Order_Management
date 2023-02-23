package com.example.appolo1.Service.Services;

import com.example.appolo1.Entity.Request;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RequestService {
    Request getRequest(Long id);
    List<Request> getAllRequests(Long id);
    List<Request> getRequestByStatus(String status);
    void makeRequest(Request request);
    void updateRequest(Request request);
    void validateRequest(Long id);
}
