package com.example.foyerrouamnissi.DAO.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Foyer")
@Builder
public class Foyer {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long idFoyer;
        @Column(name="nomFoyer")
        private  String nomFoyer;
        @Column(name="capaciteFoyer")
        private  long  capaciteFoyer;



}