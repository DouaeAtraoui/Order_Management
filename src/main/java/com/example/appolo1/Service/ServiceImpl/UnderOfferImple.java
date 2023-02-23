package com.example.appolo1.Service.ServiceImpl;

import com.example.appolo1.Entity.Under_Offer;
import com.example.appolo1.Repository.Under_OfferRepository;
import com.example.appolo1.Service.Services.UnderOfferService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UnderOfferImple implements UnderOfferService {

    @Autowired
    private Under_OfferRepository under_OfferRepository;

    @Override
    public Under_Offer consultUnder_Offer(Long id) {
        return under_OfferRepository.findById(id).get();
    }

    @Override
    public Boolean isUnder_OfferAvailable(Long id) {
        Under_Offer availableUnderOffer = under_OfferRepository.findById(id).orElse(null);
        if (availableUnderOffer.getStatus() == false){
            return false;
        }
        return true;
    }

    @Override
    public List<Under_Offer> consultAllUnder_Offers() {
        return under_OfferRepository.findAll();
    }

    @Override
    public void addUnder_Offer(Under_Offer under_Offer) {
        under_OfferRepository.save(under_Offer);
    }

    @Override
    public void updateStatusUnder_Offer(Long id) {
        Under_Offer existingUnderOffer = under_OfferRepository.findById(id).orElse(null);
        if (existingUnderOffer != null){
            existingUnderOffer.setStatus(existingUnderOffer.getStatus());
        }
        under_OfferRepository.save(existingUnderOffer);
    }

    @Override
    public void updateUnder_Offer(Under_Offer under_offer) {
        Under_Offer existingUnderOffer = under_OfferRepository.findById(under_offer.getId()).orElse(null);
        if (existingUnderOffer != null){
            existingUnderOffer.setStatus(existingUnderOffer.getStatus());
        }
        under_OfferRepository.save(existingUnderOffer);
    }
}
