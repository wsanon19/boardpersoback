package com.profileback.boardpersoback.Model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class Projet {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String nom;
    private String description;
    private Date debut;
    private Date fin;
//    private Categorie categorie;
//    private ArrayList<String> missions;
//    private HashMap<String,Double> techno; //Enum plus tard techno avec pourcentage


}
