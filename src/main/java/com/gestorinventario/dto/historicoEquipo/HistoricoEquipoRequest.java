package com.gestorinventario.dto.historicoEquipo;

import java.time.LocalDate;

public record HistoricoEquipoRequest(
        Long idHistoricoEquipos,
        String observacionEquipos,
        LocalDate fechaHistoricoEquipos,
        Long idEquipo
) {
}
