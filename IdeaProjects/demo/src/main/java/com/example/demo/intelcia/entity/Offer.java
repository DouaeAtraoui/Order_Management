package com.example.demo.intelcia.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Offer extends BaseEntity {
    private String label;
    private String titre;
    private String description;
    private Boolean status;
    @OneToMany(mappedBy = "createdBy", targetEntity = Demande.class, fetch= FetchType.EAGER)
    private List<UnderOffer> underOfferList;
}
