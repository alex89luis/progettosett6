package com.example.Progetto5.controllers.records;

import com.example.Progetto5.Enums.Luoghi;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record EventoRequest(
        @NotNull(message = "nome evento obbligatorio")
        String nome,
        @NotEmpty
        @NotNull(message = "descrizione evento obbligatorio")
         String descrizione,
         @NotNull(message = "data evento obbligatoria")
         LocalDate data,
         @NotNull(message = "Luogo obbligatorio")
         Luoghi luogo,
         @NotNull(message = "numero posti obbligatorio")
         @Min(value = 1, message = " il valore è minimo 10")
         int numeroPosti,
         @NotNull(message = "necessario")
         Long utenteid){

}
