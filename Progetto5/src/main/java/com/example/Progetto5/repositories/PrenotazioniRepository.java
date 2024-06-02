package com.example.Progetto5.repositories;

import com.example.Progetto5.entities.Prenotazioni;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrenotazioniRepository extends JpaRepository<Prenotazioni, Long> {
    Prenotazioni findByUtenteIdAndEventoId(Long idUtente, Long idEvento);
}
