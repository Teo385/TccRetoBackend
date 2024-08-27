package com.example.BODEGASTCCAPI.repository;

import com.example.BODEGASTCCAPI.models.Mercancia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMercanciaRepository extends JpaRepository<Mercancia, Long> {
    
}
