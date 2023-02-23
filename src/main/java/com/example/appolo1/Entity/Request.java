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
    private String title;
    private String description;
    @Enumerated(EnumType.STRING)
    private  Status status;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User createdBy;
    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;
    @OneToOne(mappedBy = "request")
    private Reservation reservation;
    @ManyToOne
    @JoinColumn(name="under_Offre_id", nullable = false)
    private Under_Offer underOffer;
}