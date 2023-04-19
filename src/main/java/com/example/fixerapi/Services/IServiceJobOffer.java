package com.example.fixerapi.Services;

import com.example.fixerapi.Models.jobOffer;

import java.util.List;

public interface IServiceJobOffer {

    public jobOffer createOffers(jobOffer p)  ;
    public jobOffer findOffersById(int id) ;
    public List<jobOffer> findAllOffers();
    public jobOffer updateOffers(jobOffer a) ;
    public void deleteOffers (int id);

}
