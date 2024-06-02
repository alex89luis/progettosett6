package com.example.Progetto5.servicies.exceptions;

import java.time.LocalDateTime;

public class PostiEsauritiException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public final LocalDateTime accaduta;


    public PostiEsauritiException(String message) {
        super(message);
        this.accaduta = LocalDateTime.now();

    }
}
