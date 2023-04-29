package com.example.fixerapi.Repositories;

import com.example.fixerapi.Models.client;
import com.example.fixerapi.Models.salle7;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface Salle7Repo extends JpaRepository<salle7, Long> {

    public salle7 findByEmail(String email);
    public List<salle7> findAllByFirstnameContaining(String name);
}
