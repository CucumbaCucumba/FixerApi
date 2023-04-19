package com.example.fixerapi.Services;

import com.example.fixerapi.Models.report;
import com.example.fixerapi.Models.salle7;
import com.example.fixerapi.Repositories.Salle7Repo;
import com.example.fixerapi.Repositories.jobOfferRepo;
import com.example.fixerapi.Repositories.reportRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceSalle7 implements IServiceSalle7{

    @Autowired
    Salle7Repo sr;
    @Autowired
    jobOfferRepo jr;
    @Autowired
    reportRepo rr;


    @Override
    public salle7 createsalle7(salle7 p) {
        return null;
    }

    @Override
    public Optional<salle7> findsalle7ById(String email) {
        return Optional.empty();
    }

    @Override
    public List<salle7> findAllsalle7() {
        return null;
    }

    @Override
    public salle7 updatesalle7(salle7 a) {
        return null;
    }

    @Override
    public void deletesalle7(String id) {

    }
}
