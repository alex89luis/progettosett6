package com.example.Progetto5.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="utenti")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Utente extends Base {

   private String nome;
   private String email;
   private String password;
   @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
   @JoinColumn(name = "ruolo_id")
   private Ruoli ruolo;
   @OneToMany( cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
   @JoinColumn(name = "utente_id" )
   private List<Evento> evento = new ArrayList<>();

   @Builder(setterPrefix = "with")
   public Utente(String nome, String email, String password, Ruoli ruolo) {
      this.nome = nome;
      this.email = email;
      this.password = password;
      this.ruolo = ruolo;
   }

   public void addEvento(Evento e) {
      this.evento.add(e);
   }

}
