package com.example.Progetto5.controllers;

import org.apache.coyote.BadRequestException;
import com.example.Progetto5.controllers.records.UtenteRequest;
import com.example.Progetto5.entities.Utente;
import com.example.Progetto5.servicies.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/utente")
public class UtenteController {

        @Autowired
        private UtenteService utenteService;

        @PostMapping
        public ResponseEntity<Utente> saveUtente(@Validated @RequestBody UtenteRequest request, BindingResult validator) throws BadRequestException {
            if (validator.hasErrors()) {
                throw new BadRequestException(String.valueOf(validator.getAllErrors()));
            }

            return ResponseEntity.ok(utenteService.save(request));
        }

}
