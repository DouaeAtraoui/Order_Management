package com.example.demo.intelcia.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation extends Demande{
    private Boolean status;
    private String reference;
    private String label;
    private String titre;
    private String description;
    @OneToOne
    private Demande demande;
   @OneToOne(mappedBy = "reservation")
   private Commande commande;

}
