package com.example.fixerapi.Models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER)
    profession profession;
    double Rate;
    @OneToMany(mappedBy = "salla7")
    List<jobOffer> Offers;

    @OneToMany(mappedBy = "salle7")
    List<report>Reports;


}
