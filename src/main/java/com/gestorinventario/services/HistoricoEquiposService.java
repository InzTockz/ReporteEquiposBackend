package com.gestorinventario.services;

import com.gestorinventario.dto.HistoricoEquipoDto;

import java.util.List;

public interface HistoricoEquiposService {

    List<HistoricoEquipoDto> listado();
    HistoricoEquipoDto registrar(HistoricoEquipoDto historicoEquipoDto);
    HistoricoEquipoDto modificar(Long idHistoricoEquipos, HistoricoEquipoDto historicoEquipoDto);
    void eliminar(Long idHistoricoEquipos);
}
