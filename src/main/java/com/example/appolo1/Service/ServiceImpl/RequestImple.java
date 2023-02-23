package com.example.appolo1.Service.ServiceImpl;

import com.example.appolo1.Entity.Request;
import com.example.appolo1.Repository.RequestRepository;
import com.example.appolo1.Service.Services.RequestService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RequestImple implements RequestService {
    @Autowired
    private RequestRepository requestRepository;
    @Override
    public Request getRequest(Long id) {
        return requestRepository.findById(id).get();
    }

    @Override
    public List<Request> getAllRequests(Long id) {
        return requestRepository.findAll();
    }

    @Override
    public List<Request> getRequestByStatus(String status) {
        return requestRepository.findByStatus(status);
    }

    @Override
    public void makeRequest(Request request) {
        requestRepository.save(request);
    }

    @Override
    public void updateRequest(Request request) {
        if (request.getStatus()){
            request.setLabel(request.getLabel());
            request.setTitre(request.getTitre());
            request.setDescription(request.getDescription());
        }
        requestRepository.save(request);
    }

    @Override
    public void validateRequest(Long id) {
        Request existingrequest = requestRepository.findById(id).orElse(null);
        if (existingrequest != null){
            existingrequest.setStatus(existingrequest.getStatus());
        }
        requestRepository.save(existingrequest);
    }

}
