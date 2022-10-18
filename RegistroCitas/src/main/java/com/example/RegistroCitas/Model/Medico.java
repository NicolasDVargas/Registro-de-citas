package com.example.RegistroCitas.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Medico extends Persona{
    private Integer id;
    private String  licencia;
    private String  Especialidad;
    private Integer PersonaId;  
    private Integer IPSID;
}
