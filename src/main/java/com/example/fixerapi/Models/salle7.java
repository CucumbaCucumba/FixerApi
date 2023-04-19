package com.example.fixerapi.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class salle7 extends User {


    String imagePath;
    String City;
    String tel;
    @ManyToMany
    List<profession> Professions;
    double Rate;
    @OneToMany(mappedBy = "Salle7")
    List<jobOffer> Offers;

    @OneToMany(mappedBy = "salle7")
    List<report>Reports;


}
