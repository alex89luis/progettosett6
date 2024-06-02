package com.example.Progetto5.servicies;

import com.example.Progetto5.controllers.records.UtenteRequest;

import com.example.Progetto5.entities.Ruoli;
import com.example.Progetto5.entities.Utente;
import com.example.Progetto5.repositories.RuoliRepository;
import com.example.Progetto5.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UtenteService {
    @Autowired
    UtenteRepository utente;

    @Autowired
    RuoliRepository ruoli;

    public Utente save(UtenteRequest u){
        Ruoli r = ruoli.findById(u.ruoloid()).orElseThrow(() -> new RuntimeException("ruolo non c'è"));
        var ut = Utente.builder().withNome(u.nome()).withEmail(u.email()).withPassword(u.password()).withRuolo(r).build();
        return utente.save(ut);
    }
}


