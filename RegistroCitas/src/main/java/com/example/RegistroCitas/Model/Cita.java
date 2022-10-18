package com.example.RegistroCitas.Model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cita {
    private Integer id;
    private Integer prioridad;
    private LocalDateTime fechaHoraCita;
    private String observacion;
    private String tipoCita;
    private Integer estadoCita;
    private Integer SolicitudCitaId;
}
