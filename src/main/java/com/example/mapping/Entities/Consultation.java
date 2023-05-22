package com.example.mapping.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consultation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    Date dateConsultation ;
    Double prixConcultation ;
    String rapportConsultation ;

    // En fonction ou vous voulez mettre la clef etrangere
    @OneToOne
    private RDV rendezvous ;
}
