package com.example.Progetto5.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "prenotazioni")
public class Prenotazioni extends Base{
    @ManyToOne
    @JoinColumn(name="evento_id")
    private Evento evento;
    @ManyToOne
    @JoinColumn(name="utente_id")
    private Utente utente;

}
