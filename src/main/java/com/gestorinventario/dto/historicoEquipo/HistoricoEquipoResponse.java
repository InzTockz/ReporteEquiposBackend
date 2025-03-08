package com.gestorinventario.dto.historicoEquipo;

import java.time.LocalDate;

public record HistoricoEquipoResponse(
        Long idHistoricoEquipos,
        String observacionEquipos,
        LocalDate fechaHistoricoEquipos,
        Long idEquipo
) {
}
