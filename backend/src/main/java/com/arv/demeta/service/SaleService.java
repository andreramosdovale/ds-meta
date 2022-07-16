package com.arv.demeta.service;

import com.arv.demeta.entities.Sale;
import com.arv.demeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository repository;

    public List<Sale> findSales() {
        return repository.findAll();
    }
}
