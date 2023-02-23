package com.example.appolo1.Repository;

import com.example.appolo1.Entity.Under_Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Under_OfferRepository extends JpaRepository<Under_Offer,Long> {

}
