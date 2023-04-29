package com.example.fixerapi.Models;

import ch.qos.logback.core.net.server.Client;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class jobOffer {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String nom;
    String Description;
    String Address;
    String Price;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    client cliant;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    salle7 salla7;

}
