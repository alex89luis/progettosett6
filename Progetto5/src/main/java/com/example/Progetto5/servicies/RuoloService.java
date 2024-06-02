package com.example.Progetto5.servicies;

import com.example.Progetto5.entities.Ruoli;
import com.example.Progetto5.repositories.RuoliRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RuoloService {

    @Autowired
    RuoliRepository ruoli;

    public Ruoli save(String name){
        Ruoli r = new Ruoli();
        r.setNome(name);
        ruoli.save(r);
        return r;
    }

}
