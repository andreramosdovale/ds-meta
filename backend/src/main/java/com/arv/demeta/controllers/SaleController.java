package com.arv.demeta.controllers;

import com.arv.demeta.entities.Sale;
import com.arv.demeta.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    @Autowired
    SaleService service;

    @GetMapping
    public List<Sale> findSale() {
        return service.findSales();
    }
}
