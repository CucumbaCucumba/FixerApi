package com.example.fixerapi.Repositories;

import com.example.fixerapi.Models.salle7;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Salle7Repo extends JpaRepository<salle7, Long> {

}
