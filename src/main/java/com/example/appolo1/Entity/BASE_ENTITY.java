package com.example.appolo1.Entity;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@MappedSuperclass
@Getter
@Setter

//c'est une classe de base (mère) pour les autres entités
public class BASE_ENTITY {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate createdAt;

}
