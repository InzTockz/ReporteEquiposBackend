package com.gestorinventario.services;

import com.gestorinventario.dto.historicoAsignacion.HistoricoAsignacionDto;
import com.gestorinventario.dto.historicoAsignacion.HistoricoAsignacionListadoResponse;
import com.gestorinventario.dto.historicoAsignacion.HistoricoAsignacionRequest;
import com.gestorinventario.dto.historicoAsignacion.HistoricoAsignacionResponse;

import java.util.List;

public interface HistoricoAsignacionService {

    List<HistoricoAsignacionListadoResponse> listado();
    HistoricoAsignacionResponse registrar(HistoricoAsignacionRequest historicoAsignacionRequest);
    HistoricoAsignacionResponse modificar(Long idHistoricoAsignacion, HistoricoAsignacionRequest historicoAsignacionRequest);
    void eliminar(Long idHistoricoAsignacion);
    HistoricoAsignacionResponse buscarPorIdUsuarioAsignado(Long idUsuarioAsignado);
}
