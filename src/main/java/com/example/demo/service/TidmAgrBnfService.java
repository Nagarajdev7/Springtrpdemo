package com.example.demo.service;


import com.example.demo.model.TidmAgrBnf;
import com.example.demo.repository.TidmAgrBnfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TidmAgrBnfService {

    @Autowired
    private TidmAgrBnfRepository tidmAgrBnfRepository;

    public List<TidmAgrBnf> getAll() {
        List<TidmAgrBnf> tidmAgrBnf = tidmAgrBnfRepository.findAll();
        return tidmAgrBnf;
    }

    public TidmAgrBnf getById(Long agrId){
        return tidmAgrBnfRepository.getOne(agrId);
    }

    public void put(TidmAgrBnf tidmAgrBnf){
        tidmAgrBnfRepository.save(tidmAgrBnf);
    }

    public void putAll(List<TidmAgrBnf> tidmAgrBnfs){
        tidmAgrBnfs.forEach(record->tidmAgrBnfRepository.save(record));
    }
}
