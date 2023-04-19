package com.example.fixerapi.Services;

import com.example.fixerapi.Models.admin;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;
import java.util.Optional;

public interface IServiceadmin {

    public admin createadmin(admin p)  ;
    public Optional<UserDetails> findadminById(String id) ;
    public List<admin> findAlladmin();
    public admin updateadmin(admin a) ;
    public void deleteadmin (String id);
}
