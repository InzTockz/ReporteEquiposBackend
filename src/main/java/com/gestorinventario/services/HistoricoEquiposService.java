package com.gestorinventario.services;

import com.gestorinventario.dto.HistoricoEquipoDto;
import com.gestorinventario.dto.historicoEquipo.HistoricoEquipoListadoResponse;

import java.util.List;

public interface HistoricoEquiposService {

    List<HistoricoEquipoListadoResponse> listado();
    HistoricoEquipoDto registrar(HistoricoEquipoDto historicoEquipoDto);
    HistoricoEquipoDto modificar(Long idHistoricoEquipos, HistoricoEquipoDto historicoEquipoDto);
    void eliminar(Long idHistoricoEquipos);

    List<HistoricoEquipoListadoResponse> listadoPorIdEquipo(Long idEquipo);
}
