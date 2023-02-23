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
    private String title;
    @Enumerated(EnumType.STRING)
    private Status status;
    @OneToOne
    @JoinColumn(name = "request_id", nullable = false)
    private Request request;
    @OneToOne(mappedBy = "reservation", targetEntity = Order.class)
    private Order order;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User createdBy;
}
