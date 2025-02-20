package com.gestorinventario.services;

import com.gestorinventario.dto.HistoricoAsignacionDto;

import java.util.List;

public interface HistoricoAsignacionService {

    List<HistoricoAsignacionDto> listado();
    HistoricoAsignacionDto registrar(HistoricoAsignacionDto historicoAsignacionDto);
    HistoricoAsignacionDto modificar(Long idHistoricoAsignacion, HistoricoAsignacionDto historicoAsignacionDto);
    void eliminar(Long idHistoricoAsignacion);
}
