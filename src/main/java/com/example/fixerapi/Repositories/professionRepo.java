package com.example.fixerapi.Repositories;

import com.example.fixerapi.Models.profession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface professionRepo extends JpaRepository<profession,Integer> {
}
