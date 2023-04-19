package com.example.fixerapi.Repositories;

import com.example.fixerapi.Models.jobOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jobOfferRepo extends JpaRepository<jobOffer,Integer> {
}
