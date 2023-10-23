package com.cambio.cambioservicio.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="cambio")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cambio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCambio;
    private String monedaOrigen;
    private Double montoOrigen;
    private String monedaDestino;
    private Double montoDestino;
    private Double tipoCambio;

    public Long getIdCambio() {
        return idCambio;
    }

    public void setIdCambio(Long idCambio) {
        this.idCambio = idCambio;
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(String monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public Double getMontoOrigen() {
        return montoOrigen;
    }

    public void setMontoOrigen(Double montoOrigen) {
        this.montoOrigen = montoOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(String monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    public Double getMontoDestino() {
        return montoDestino;
    }

    public void setMontoDestino(Double montoDestino) {
        this.montoDestino = montoDestino;
    }

    public Double getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(Double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }
}
