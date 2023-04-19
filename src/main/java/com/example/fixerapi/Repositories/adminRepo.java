package com.example.fixerapi.Repositories;

import com.example.fixerapi.Models.admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface adminRepo extends JpaRepository<admin , Long>{
}
