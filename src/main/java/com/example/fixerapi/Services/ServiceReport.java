package com.example.fixerapi.Services;

import com.example.fixerapi.Models.report;
import com.example.fixerapi.Repositories.reportRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceReport implements IServiceReport{

    @Autowired
    reportRepo rr;

    @Override
    public report createreport(report p) {
        return rr.save(p);
    }

    @Override
    public report findreportById(int id) {
        return rr.findById(id).get();
    }

    @Override
    public List<report> findAllreport() {
        return rr.findAll();
    }

    @Override
    public report updatereport(report a) {
        return rr.save(a);
    }

    @Override
    public void deletereport(int id) {
        rr.deleteById(id);
    }
}
