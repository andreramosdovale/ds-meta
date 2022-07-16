package com.arv.demeta.controllers;

import com.arv.demeta.entities.Sale;
import com.arv.demeta.service.SaleService;
import com.arv.demeta.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    @Autowired
    SaleService service;
    @Autowired
    private SmsService smsSercive;

    @GetMapping
    public Page<Sale> findSale(
            @RequestParam(value="minDate", defaultValue = "") String minDate,
            @RequestParam(value="maxDate", defaultValue = "") String maxDate,
            Pageable pegeable
    ) {
        return service.findSales(minDate, maxDate, pegeable);
    }

    @GetMapping(value = "/{id}/notification")
    public void notifySms(@PathVariable Long id) {
        smsSercive.sendSms(id);
    }
}
