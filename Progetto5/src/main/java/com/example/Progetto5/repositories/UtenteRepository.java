package com.example.Progetto5.repositories;

import com.example.Progetto5.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente,Long> {
}
