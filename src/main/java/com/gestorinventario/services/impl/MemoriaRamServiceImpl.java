package com.gestorinventario.services.impl;

import com.gestorinventario.entity.MemoriaRamEntity;
import com.gestorinventario.services.MemoriaRamService;

import java.util.List;

public class MemoriaRamServiceImpl implements MemoriaRamService {
    @Override
    public List<MemoriaRamEntity> listado() {
        return List.of();
    }

    @Override
    public MemoriaRamEntity registrar(MemoriaRamEntity memoriaRamEntity) {
        return null;
    }

    @Override
    public MemoriaRamEntity modificar(int idMemoriaRam, MemoriaRamEntity memoriaRamEntity) {
        return null;
    }

    @Override
    public void eliminar(int idMemoriaRam) {

    }
}
