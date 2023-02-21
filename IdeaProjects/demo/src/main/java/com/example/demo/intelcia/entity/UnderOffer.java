package com.example.demo.intelcia.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UnderOffer extends Offer {
    private String label;
    private  String title;
    private  String description;
    private Boolean status;
    private  Double price;
    @ManyToOne
    private Offer offer;
    @ManyToOne
    private Demande demande;


}
