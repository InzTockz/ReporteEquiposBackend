package com.gestorinventario.services;

import com.gestorinventario.dto.EquipoDto;

import java.util.List;

public interface EquipoService {

    List<EquipoDto> listado();
    EquipoDto registrar(EquipoDto equipoDto);
    EquipoDto modificar(Long idEquipo, EquipoDto equipoDto);
    void eliminar(Long idEquipo);
}
