package com.gestorinventario.services;

import com.gestorinventario.dto.AreasDto;

import java.util.List;

public interface AreasService {

    List<AreasDto> listado();
    AreasDto registrar(AreasDto areasDto);
    AreasDto modificar(Long idArea, AreasDto areasDto);
    void eliminar(Long idArea);
    List<AreasDto> listadoPorId(Long idArea);
}
