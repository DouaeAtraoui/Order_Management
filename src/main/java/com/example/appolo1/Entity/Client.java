package com.example.appolo1.Entity;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Client extends BASE_ENTITY{
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String CIN;
    @OneToMany(mappedBy = "client", targetEntity = Request.class, fetch = FetchType.LAZY)
    private List<Request> requests;
}
