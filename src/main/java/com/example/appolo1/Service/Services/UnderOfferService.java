package com.example.appolo1.Service.Services;

import com.example.appolo1.Entity.Offer;
import com.example.appolo1.Entity.Under_Offer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UnderOfferService {
    Under_Offer consultUnder_Offer(Long id);
    Boolean isUnder_OfferAvailable(Long id);
    List<Under_Offer> consultAllUnder_Offers();
    void addUnder_Offer(Under_Offer under_Offer);
    void updateStatusUnder_Offer(Long id);
    void updateUnder_Offer(Under_Offer under_offer);
}
