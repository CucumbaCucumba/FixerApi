package com.example.fixerapi.Services;

import com.example.fixerapi.Models.profession;
import com.example.fixerapi.Repositories.professionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProfession implements IServiceProfession{

    @Autowired
    professionRepo pr;

    @Override
    public profession createProfession(profession p) {
        return pr.save(p);
    }

    @Override
    public profession findProfessionById(int id) {
        return pr.findById(id).get();
    }

    @Override
    public List<profession> findAllProfessions() {
        return pr.findAll();
    }

    @Override
    public profession updateProfession(profession a) {
        return pr.save(a);
    }

    @Override
    public void deleteProfession(int id) {
        pr.deleteById(id);
    }
}
