package com.example.Progetto5.entities;

import jakarta.persistence.*;
import lombok.Data;


    @MappedSuperclass
    @Data
    public class Base {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Long id;
    }

