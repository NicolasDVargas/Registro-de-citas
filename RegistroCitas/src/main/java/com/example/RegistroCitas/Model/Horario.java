package com.example.RegistroCitas.Model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Horario {
    private Integer id;
    private String  dias;
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;
    private String habitacion;
    private String edificio;
}
