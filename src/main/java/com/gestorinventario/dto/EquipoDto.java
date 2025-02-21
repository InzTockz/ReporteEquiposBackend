package com.gestorinventario.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EquipoDto {

    private Long idEquipo;
    private String modeloEquipo;
    private String serieEquipo;
    private LocalDate fechaIngresoEquipo;
    private LocalDate fechaFabricacionEquipo;
    private Long idAlmacenamiento;
    private Long idProcesador;
    private Long idMemoriaRam;
    private Long idMarca;
    private boolean estadoEquipo;
    private boolean disponibilidadEquipo;
}
