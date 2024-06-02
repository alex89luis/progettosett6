package com.example.Progetto5.entities;

import com.example.Progetto5.Enums.Luoghi;
import jakarta.persistence.Entity;
import lombok.*;
import jakarta.persistence.Table;
import java.time.LocalDate;
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="eventi")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
public class Evento extends Base{
    private String titolo;
    private String descrizione;
    private LocalDate data;
    private Luoghi luogo;
    private int numeroPosti;
}
