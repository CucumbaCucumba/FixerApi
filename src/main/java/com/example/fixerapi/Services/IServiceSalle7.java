package com.example.fixerapi.Services;

import com.example.fixerapi.Models.salle7;

import java.util.List;
import java.util.Optional;

public interface IServiceSalle7 {

    public salle7 createsalle7(salle7 p)  ;
    public Optional<salle7> findsalle7ById(String email) ;
    public List<salle7> findAllsalle7();
    public salle7 updatesalle7(salle7 a) ;
    public void deletesalle7 (String id);
}
