package com.example.mapping.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor

public class Patient {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    String name ;
    String email ;
    // Le cas de lazy les donnes concernant les RDV vont etre charge qu on cas de besoin a travers un getter
    // Le cas de Eager les donnes de RDV seront charge des que vous demander les donnes du patient
    // NB : Dans le cas de EAGER il faut initialiser la liste ex : list<> rd = new ArrayList<> ;
    @OneToMany(mappedBy = "patient" , fetch = FetchType.LAZY)
    List<RDV> rendezvous ;

    // Dans les relations bidirectionnel chaque entite doit avoir un attribut de l autre , dans le cas de onetomany
    // L entite cote one doit etre declare comme cle etrangere dans celle cote many d ou la necessite de mentionner @OneToMany(mappedBy = "patient"
}
