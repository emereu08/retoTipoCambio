package com.cambio.cambioservicio.repository;

import com.cambio.cambioservicio.entity.TipoCambio;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoCambioRepository extends JpaRepository<TipoCambio, Long> {
    @Query("SELECT t FROM TipoCambio t WHERE t.monedaOrigen = :monedaOrigen AND t.monedaDestino = :monedaDestino")
    List<TipoCambio> buscarTipoCambio(@Param("monedaOrigen") String monedaOrigen, @Param("monedaDestino") String monedaDestino);
}
