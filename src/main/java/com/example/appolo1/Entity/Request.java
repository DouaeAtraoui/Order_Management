package com.example.appolo1.Entity;

//Des importations externes
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//Des importations externes
import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Request extends BASE_ENTITY {
    private String reference;
    private String label;
    private String titre;
    private String description;
    private  Boolean status;
    @ManyToOne
    private User createdBy;
    @ManyToOne
    private Client client;
    @OneToOne(mappedBy = "request")
    private Reservation reservation;
}