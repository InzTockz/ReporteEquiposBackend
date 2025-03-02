package com.gestorinventario.dto.historicoAsignacion;

import java.time.LocalDate;

public record HistoricoAsignacionListadoResponse (
        Long idHistorico,
        String modeloEquipo,
        String serieEquipo,
        String modeloProcesador,
        String nombreMarca,
        String capacidadAlmacenamiento,
        String tamanioMemoriaRam,
        LocalDate fechaIngresoEquipo,
        LocalDate fechaFabricacionEquipo,
        Long idEquipo
) { }
