package com.example.demo.intelcia.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Demande extends BaseEntity {
    private Boolean status;
    private String reference;
    private String label;
    private String titre;
    private String description;
    @OneToOne(mappedBy = "demande")
    private Reservation reservation;
    @ManyToOne
    private Client client;
    @ManyToOne
    private User createdBy;


}
