package com.example.fixerapi.Repositories;

import com.example.fixerapi.Models.client;
import com.example.fixerapi.Models.report;
import com.example.fixerapi.Models.salle7;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface reportRepo extends JpaRepository<report,Integer> {

    public List<report> findAllByClient(client c);
    public List<report> findAllBySalle7(salle7 s);

}
