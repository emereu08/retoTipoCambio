package com.cambio.cambioservicio.controller;

import com.cambio.cambioservicio.entity.Cambio;
import com.cambio.cambioservicio.service.CambioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/cambio")
@RestController
public class CambioController {

    @Autowired
    CambioService cambioService;
    @PostMapping("/")
    public Cambio realizarCambio(@RequestBody Cambio cambio){
        return cambioService.realizarCambio(cambio);
    }
}
