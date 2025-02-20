package com.gestorinventario.services;

import com.gestorinventario.dto.ProcesadorDto;

import java.util.List;

public interface ProcesadorService {

    List<ProcesadorDto> listado();
    ProcesadorDto registrar(ProcesadorDto procesadorDto);
    ProcesadorDto modificar(Long idProcesador, ProcesadorDto procesadorDto);
    void eliminar(Long idProcesador);
}
