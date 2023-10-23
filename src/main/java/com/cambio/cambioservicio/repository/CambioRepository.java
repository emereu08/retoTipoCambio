package com.cambio.cambioservicio.repository;

import com.cambio.cambioservicio.entity.Cambio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CambioRepository extends JpaRepository<Cambio, Long> {

}
