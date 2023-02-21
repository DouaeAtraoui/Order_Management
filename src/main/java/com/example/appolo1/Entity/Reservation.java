package com.example.appolo1.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Reservation extends Request {
    private String reference;
    private String label;
    private String titre;
    private String description;
    private  Boolean status;
    @OneToOne
    private Request request;
    @OneToOne(mappedBy = "reservation")
    private Order order;
}
