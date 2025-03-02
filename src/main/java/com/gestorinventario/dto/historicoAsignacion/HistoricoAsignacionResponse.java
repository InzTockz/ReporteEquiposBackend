package com.gestorinventario.dto.historicoAsignacion;

import java.time.LocalDate;

public record HistoricoAsignacionResponse (
        Long idHistorico,
        Long idUsuarioAsignado,
        Long idEquipo,
        String detalleHistorico,
        LocalDate fechaHistorico,
        boolean estadoHistorico
) { }
