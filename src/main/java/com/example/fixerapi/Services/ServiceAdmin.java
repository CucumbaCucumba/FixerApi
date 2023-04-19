package com.example.fixerapi.Services;

import com.example.fixerapi.Models.admin;
import com.example.fixerapi.Repositories.adminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceAdmin implements IServiceadmin{
    @Autowired
    adminRepo ar;

    @Override
    public admin createadmin(admin p) {
        return null;
    }

    @Override
    public Optional<UserDetails> findadminById(String id) {
        return Optional.empty();
    }

    @Override
    public List<admin> findAlladmin() {
        return null;
    }

    @Override
    public admin updateadmin(admin a) {
        return null;
    }

    @Override
    public void deleteadmin(String id) {

    }
}
