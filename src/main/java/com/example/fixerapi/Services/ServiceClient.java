package com.example.fixerapi.Services;

import com.example.fixerapi.Models.client;
import com.example.fixerapi.Repositories.clientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*@Service*/
public class ServiceClient implements IServiceClient{

    @Autowired
    clientRepo cr;


    @Override
    public client createclient(client p) {
        return null;
    }

    @Override
    public Optional<UserDetails> findclientById(String email) {
        return Optional.empty();
    }

    @Override
    public List<client> findAllclient() {
        return null;
    }

    @Override
    public client updateclient(client a) {
        return null;
    }

    @Override
    public void deleteclient(String id) {

    }
}
