package com.gestorinventario.dto.historicoEquipo;

import java.time.LocalDate;

public record HistoricoEquipoListadoResponse(

        Long idHistoricoEquipos,
        String modeloEquipo,
        String serieEquipo,
        String observacionEquipos,
        LocalDate fechaHistoricoEquipos
) {
}
