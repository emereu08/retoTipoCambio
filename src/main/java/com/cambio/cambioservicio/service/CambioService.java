package com.cambio.cambioservicio.service;

import com.cambio.cambioservicio.entity.Cambio;
import com.cambio.cambioservicio.entity.TipoCambio;
import com.cambio.cambioservicio.repository.CambioRepository;
import com.cambio.cambioservicio.repository.TipoCambioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CambioService {
    @Autowired
    private CambioRepository cambioRepository;

    @Autowired
    private TipoCambioRepository tipoCambioRepository;

    public Cambio realizarCambio(Cambio cambio) {
        String monedaOrigen = cambio.getMonedaOrigen();
        String monedaDestino = cambio.getMonedaDestino();

        Double valorTipoCambio = new Double(0.0);

        try {
            //List<TipoCambio> lista = tipoCambioRepository.findAll();
            List<TipoCambio> lista = tipoCambioRepository.buscarTipoCambio(monedaOrigen, monedaDestino);

            for(TipoCambio elemento: lista){
                if(monedaOrigen.equals(elemento.getMonedaOrigen()) && monedaDestino.equals(elemento.getMonedaDestino())) {
                    valorTipoCambio = elemento.getTipoCambio();
                    break;
                }
            }

            cambio.setTipoCambio(valorTipoCambio);

            Double montoDestino = valorTipoCambio*cambio.getMontoOrigen();

            cambio.setMontoDestino(montoDestino);
        }catch (Exception e){

        }


        return cambioRepository.save(cambio);
    }
}
