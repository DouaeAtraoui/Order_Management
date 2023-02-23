package com.example.appolo1.Service.ServiceImpl;

import com.example.appolo1.Entity.Offer;
import com.example.appolo1.Repository.OfferRepository;
import com.example.appolo1.Service.Services.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class OfferImple implements OfferService {

    @Autowired
    private OfferRepository offerRepository;

    @Override
    public Offer consultOffer(Long id) {
        return offerRepository.findById(id).get();
    }

    @Override
    public Boolean isOfferAvailable(Long id) {
        Offer offer = offerRepository.findById(id).orElse(null);
        if(offer.getStatus() == false){
            return false;
        }
        return true;
    }

    @Override
    public List<Offer> consultAllOffers() {
        return offerRepository.findAll();
    }

    @Override
    public void addOffer(Offer offer) {
        offerRepository.save(offer);
    }

    @Override
    public void updateStatusOffer(String status, Long id) {
        Offer existingOffer = offerRepository.findById(id).orElse(null);
        if (existingOffer != null){
            existingOffer.setStatus(existingOffer.getStatus());
        }
        offerRepository.save(existingOffer);
    }

    @Override
    public void updateOffer(Offer offer) {
        Offer existingUnder_Offer = offerRepository.findById(offer.getId()).orElse(null);
        if (existingUnder_Offer != null){
            existingUnder_Offer.setLabel(existingUnder_Offer.getLabel());
            existingUnder_Offer.setTitre(existingUnder_Offer.getTitre());
            existingUnder_Offer.setDescription(existingUnder_Offer.getDescription());
        }
        offerRepository.save(existingUnder_Offer);
    }
}
