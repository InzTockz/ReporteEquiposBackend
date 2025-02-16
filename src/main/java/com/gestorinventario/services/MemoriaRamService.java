package com.gestorinventario.services;

import com.gestorinventario.entity.MemoriaRamEntity;

import java.util.List;

public interface MemoriaRamService {

    List<MemoriaRamEntity> listado();
    MemoriaRamEntity registrar(MemoriaRamEntity memoriaRamEntity);
    MemoriaRamEntity modificar(int idMemoriaRam, MemoriaRamEntity memoriaRamEntity);
    void eliminar(int idMemoriaRam);
}
