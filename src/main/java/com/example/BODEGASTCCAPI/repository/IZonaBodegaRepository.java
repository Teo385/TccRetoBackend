package com.example.BODEGASTCCAPI.repository;

import com.example.BODEGASTCCAPI.models.ZonaBodega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IZonaBodegaRepository  extends JpaRepository<ZonaBodega, Long> {
}
