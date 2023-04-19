package com.example.fixerapi.Services;

import com.example.fixerapi.Models.salle7;
import com.example.fixerapi.Repositories.Salle7Repo;
import com.example.fixerapi.Repositories.adminRepo;
import com.example.fixerapi.Repositories.clientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;
import java.util.Optional;

public class ServiceUser implements IServiceUsers{


    @Override
    public Optional<UserDetails> findUserByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public List<salle7> findAllUser() {
        return null;
    }

    @Override
    public void deleteUser(String id) {

    }
}
