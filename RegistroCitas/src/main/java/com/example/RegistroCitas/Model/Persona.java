package com.example.RegistroCitas.Model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Persona {
    private Integer id;
    private Integer cedula;
    private String  nombre;
    private String apellido;
    private Integer telefono;
    private LocalDate fechaNacimiento;
    private String correo;
}
