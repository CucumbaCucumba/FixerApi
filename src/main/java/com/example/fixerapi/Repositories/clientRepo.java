package com.example.fixerapi.Repositories;

import com.example.fixerapi.Models.client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface clientRepo extends JpaRepository<client, Long> {
    public client findByEmail(String email);
}
