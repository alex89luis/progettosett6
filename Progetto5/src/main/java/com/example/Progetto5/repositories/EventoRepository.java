package com.example.Progetto5.repositories;

import com.example.Progetto5.entities.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento,Long> {
}
