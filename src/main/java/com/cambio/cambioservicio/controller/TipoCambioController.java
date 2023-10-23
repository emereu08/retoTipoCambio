package com.cambio.cambioservicio.controller;

import com.cambio.cambioservicio.entity.TipoCambio;
import com.cambio.cambioservicio.service.TipoCambioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/tipocambio")
@RestController
public class TipoCambioController {
    @Autowired
    TipoCambioService tipoCambioService;

    @PostMapping("/")
    public void actualizarTipoCambio(@RequestBody TipoCambio tipoCambio){
        tipoCambioService.updateTipoCambio(tipoCambio);
        //PRUEBA
    }
}
