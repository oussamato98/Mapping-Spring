package com.example.mapping.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class RDV {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    Date date ;
    Date heure ;
    @ManyToOne
    private Patient patient ;
    @ManyToOne
    private Medecin medecin ;

    // Dans ONETOONE on utilise mappedby dans la relation ou elle doit figurer comme clefs etrangere dans l autre
    // le rendez vous est cree avant la consultation donc ca va pas etre logique de mettre consultation comme clef
    // etragere dans rendez vous alors qu elle est pas encore cree
    @OneToOne(mappedBy = "rendezvous")
    private Consultation consultation ;
}
