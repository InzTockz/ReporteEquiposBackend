package com.gestorinventario.services;

import com.gestorinventario.dto.MemoriaRamDto;

import java.util.List;

public interface MemoriaRamService {

    List<MemoriaRamDto> listado();
    MemoriaRamDto registrar(MemoriaRamDto memoriaRamDto);
    MemoriaRamDto modificar(Long idMemoriaRam, MemoriaRamDto memoriaRamDto);
    void eliminar(Long idMemoriaRam);
}
