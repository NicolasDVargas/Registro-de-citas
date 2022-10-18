package com.example.RegistroCitas.Model;


import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SolicitudCita {
    private Integer id;
    private String sercivio;
    private Integer autorizacion;
    private LocalDateTime fechaHoraCita;
    private String tipoAgendamiento;
    private Integer estado;
    private Integer personaId;
    private Integer MedicoId;

}
