package com.example.RegistroCitas.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Paciente extends Persona {
    private Integer id;
    private String  estadoCivil;
    private Integer edad;
    private String  sexo;
    private String  ocupacion;
    private String  direccion;
    private String  tipoDeSangre;
    private String  regimen;
    private Integer afilaido;
    private float   peso; 
    private float   altura;
    private String  region;
}
