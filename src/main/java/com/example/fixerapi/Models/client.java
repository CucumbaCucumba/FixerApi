package com.example.fixerapi.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class client extends User{

    String imagePath;
    String City;
    String tel;
    @OneToMany(mappedBy = "Client")
    List<jobOffer> Offers;
    @OneToMany(mappedBy = "client")
    List<report>Reports;

}
