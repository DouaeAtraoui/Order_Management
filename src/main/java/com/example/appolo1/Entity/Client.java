package com.example.appolo1.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client extends BASE_ENTITY{
    private String firstName;
    private String lastName;
    private String phone;
    private Boolean status;
    @OneToMany(mappedBy = "client", targetEntity = Request.class)
    private List<Request> requests;
}
