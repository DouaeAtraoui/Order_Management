package com.example.demo.intelcia.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.swing.text.StyledEditorKit;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Commande extends Reservation{
    private Boolean status;
    private String reference;
    private String label;
    private String titre;
    private String description;
    @OneToOne
    private Reservation reservation;
}
