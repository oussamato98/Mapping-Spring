package com.example.mapping.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Medecin {

    Long id ;
    String nom ;
    String email ;
    String specialite ;

    // si on mentionne pas fetch la valeur par defaut sera lazy
    // Dans la compostion forte on utilise toujours EAGER l exepmle de la voiture qui se compose des roues et un moteur
    // le signe de la compostion sera du cote entite voiture
    @OneToMany(mappedBy = "medecin" , fetch = FetchType.LAZY)
    List<RDV> rendezvous ;

}
