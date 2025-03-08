package com.gestorinventario.dto.historicoAsignacion;

public record HistoricoAsignacionRequest (
        Long idHistorico,
        Long idUsuarioAsignado,
        Long idEquipo,
        String detalleHistorico,
        boolean estadoHistorico
){}
