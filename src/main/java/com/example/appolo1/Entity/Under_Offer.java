package com.example.appolo1.Entity;

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
public class Under_Offer extends BASE_ENTITY{
    private String label;
    private String description;
    private Boolean status;
    private Double price;
    @ManyToOne
    private Offer offer;
    @ManyToOne
    private Request request;
}
