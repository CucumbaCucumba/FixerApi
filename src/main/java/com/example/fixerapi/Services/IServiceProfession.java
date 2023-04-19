package com.example.fixerapi.Services;

import com.example.fixerapi.Models.profession;

import java.util.List;

public interface IServiceProfession {

    public profession createProfession(profession p)  ;
    public profession findProfessionById(int id) ;
    public List<profession> findAllProfessions();
    public profession updateProfession(profession a) ;
    public void deleteProfession (int id);
}
