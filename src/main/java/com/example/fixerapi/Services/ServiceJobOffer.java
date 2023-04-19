package com.example.fixerapi.Services;

import com.example.fixerapi.Models.jobOffer;
import com.example.fixerapi.Repositories.jobOfferRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceJobOffer implements IServiceJobOffer{

    @Autowired
    jobOfferRepo jr;

    @Override
    public jobOffer createOffers(jobOffer p) {
        return jr.save(p);
    }

    @Override
    public jobOffer findOffersById(int id) {
        return jr.findById(id).get();
    }

    @Override
    public List<jobOffer> findAllOffers() {
        return jr.findAll();
    }

    @Override
    public jobOffer updateOffers(jobOffer a) {
        return jr.save(a);
    }

    @Override
    public void deleteOffers(int id) {
        jr.deleteById(id);
    }
}
