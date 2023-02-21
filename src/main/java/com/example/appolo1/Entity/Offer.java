package com.example.appolo1.Entity;

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
public class Offer extends BASE_ENTITY{
    private String label;
    private String description;
    private Boolean status;
    @OneToMany(mappedBy = "offer", targetEntity = Under_Offer.class, fetch = FetchType.EAGER)
    private List<Under_Offer> underOffers;
}
