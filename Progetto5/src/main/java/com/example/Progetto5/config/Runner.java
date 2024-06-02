package com.example.Progetto5.config;

import com.example.Progetto5.entities.Ruoli;
import com.example.Progetto5.servicies.RuoloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Runner implements CommandLineRunner {
    @Autowired
    RuoloService ruolo;


    @Override
    public void run(String... args) throws Exception {
    try {

        ruolo.save("organizzazione");

            System.err.println();
    }catch (Exception e){
        log.error("errore nel salvataggio");
}



        }

    }

