package com.example.fixerapi.Repositories;

import com.example.fixerapi.Models.client;
import com.example.fixerapi.Models.jobOffer;
import com.example.fixerapi.Models.salle7;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface jobOfferRepo extends JpaRepository<jobOffer,Integer> {

    public List<jobOffer> findAllBySalla7(salle7 s);
    public List<jobOffer> findAllByCliant(client c);

}
