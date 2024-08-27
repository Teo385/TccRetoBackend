package com.example.BODEGASTCCAPI.repository;

import com.example.BODEGASTCCAPI.models.Remitente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRemitenteRepository extends JpaRepository<Remitente, Long> {
}
