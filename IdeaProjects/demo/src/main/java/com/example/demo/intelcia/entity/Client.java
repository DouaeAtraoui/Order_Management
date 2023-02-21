package com.example.demo.intelcia.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client extends BaseEntity {
    private String firstName;
    private String lastName;
    private String phone;
    private Boolean status;
    @OneToMany(mappedBy = "client", targetEntity = Demande.class)
    private List<Demande> demandeList;
}
