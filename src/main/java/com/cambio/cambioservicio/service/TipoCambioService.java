package com.cambio.cambioservicio.service;

import com.cambio.cambioservicio.entity.TipoCambio;
import com.cambio.cambioservicio.repository.TipoCambioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoCambioService {
    @Autowired
    private TipoCambioRepository tipoCambioRepository;

    public  void updateTipoCambio(TipoCambio tipoCambio){
        String monedaOrigen = tipoCambio.getMonedaOrigen();
        String monedaDestino = tipoCambio.getMonedaDestino();
        Double valTipoCambio = tipoCambio.getTipoCambio();

        Long idTipoCambio = new Long("0");

        try {
            List<TipoCambio> lista = tipoCambioRepository.buscarTipoCambio(monedaOrigen, monedaDestino);

            for(TipoCambio elemento: lista){
                idTipoCambio = elemento.getIdTipoCambio();

            }

            tipoCambio.setIdTipoCambio(idTipoCambio);

            tipoCambioRepository.save(tipoCambio);

        }catch (Exception e){

        }
    }
}
