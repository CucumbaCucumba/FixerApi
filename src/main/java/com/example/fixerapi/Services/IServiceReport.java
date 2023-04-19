package com.example.fixerapi.Services;

import com.example.fixerapi.Models.report;

import java.util.List;

public interface IServiceReport {

    public report createreport(report p)  ;
    public report findreportById(int id) ;
    public List<report> findAllreport();
    public report updatereport(report a) ;
    public void deletereport (int id);
}
