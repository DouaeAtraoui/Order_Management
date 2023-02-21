package com.example.appolo1.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//extendre l'entité BASE_ENTITY pour hériter le champs id(clé primaire)
public class User extends BASE_ENTITY{
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String password;
    private String passwordToConfirm;
    @Enumerated(EnumType.STRING)
    private Role role;
    private Boolean status;
    private String token;
    //The user will creates some requests
    @OneToMany(mappedBy = "createdBy", targetEntity = Request.class)
    private List<Request> requests;
}
