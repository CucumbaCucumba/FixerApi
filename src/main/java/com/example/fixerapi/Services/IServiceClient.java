package com.example.fixerapi.Services;

import com.example.fixerapi.Models.client;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;
import java.util.Optional;

public interface IServiceClient {

    public client createclient(client p)  ;
    public Optional<UserDetails> findclientById(String email) ;
    public List<client> findAllclient();
    public client updateclient(client a) ;
    public void deleteclient (String id);
}
