package com.example.appolo1.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Data
//c'est une classe de base (mère) pour les autres entités
public class BASE_ENTITY {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@CreatedDate permet d'ajouter automatiquement la date de création à une entité lorsqu'elle
    //est persistée dans la base de données.
    @CreatedDate
    private LocalDate createdAt;

}
