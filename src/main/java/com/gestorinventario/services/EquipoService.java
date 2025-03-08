package com.gestorinventario.services;

import com.gestorinventario.dto.EquipoDto;
import com.gestorinventario.entity.EquipoEntity;

import java.util.List;

public interface EquipoService {

    List<EquipoDto> listado();
    List<EquipoDto> listadoPorDisponibilidad();
    EquipoDto registrar(EquipoDto equipoDto);
    EquipoDto modificar(Long idEquipo, EquipoDto equipoDto);
    void eliminar(Long idEquipo);
    EquipoDto buscarPorIdEquipo(Long idEquipo);

    //Listados Personalizados
    List<EquipoDto> listadoPorIdUsuarioAsignado(Long idUsuarioAsignado);
    List<EquipoDto> listadoEntreFechaDeFabricacion(Integer fechaIni, Integer FechaFin);
}
