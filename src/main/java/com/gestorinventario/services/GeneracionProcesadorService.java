package com.gestorinventario.services;

import com.gestorinventario.dto.GeneracionProcesadorDto;

import java.util.List;

public interface GeneracionProcesadorService {

    List<GeneracionProcesadorDto> listado();
    GeneracionProcesadorDto registrar(GeneracionProcesadorDto generacionProcesadorDto);
    GeneracionProcesadorDto modificar(Long idGeneracionProcesador, GeneracionProcesadorDto generacionProcesadorDto);
    void eliminar(Long idGeneracionProcesador);
}
