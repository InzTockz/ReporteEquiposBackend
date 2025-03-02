package com.gestorinventario.dto.historicoAsignacion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HistoricoAsignacionDto {

    /*
    private Long idHistorico;
    private Long idUsuarioAsignado;
    private Long idEquipo;
    private String detalleHistorico;
    private LocalDate fechaHistorico;
    private boolean estadoHistorico;
    */

    private Long idHistorico;
    private String modeloEquipo;
    private String serieEquipo;
    private String modeloProcesador;
    private String nombreMarca;
    private String capacidadAlmacenamiento;
    private String tamanioMemoriaRam;
    private LocalDate fechaIngresoEquipo;
    private LocalDate fechaFabricacionEquipo;
    private Long idEquipo;
}
