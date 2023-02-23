package com.example.appolo1.Service.Services;

import com.example.appolo1.Entity.Offer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OfferService {
    Offer consultOffer(Long id);
    Boolean isOfferAvailable(Long id);
    List<Offer> consultAllOffers();
    void addOffer(Offer offer);
    void updateStatusOffer(String status, Long id);
    void updateOffer(Offer offer);
}
