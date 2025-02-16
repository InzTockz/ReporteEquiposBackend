package com.gestorinventario.services.impl;

import com.gestorinventario.entity.EquipoEntity;
import com.gestorinventario.services.EquipoService;

import java.util.List;

public class EquipoServiceImpl implements EquipoService {
    @Override
    public List<EquipoEntity> listado() {
        return List.of();
    }

    @Override
    public EquipoEntity registrar(EquipoEntity equipoEntity) {
        return null;
    }

    @Override
    public EquipoEntity modificar(int idEquipo, EquipoEntity equipoEntity) {
        return null;
    }

    @Override
    public void eliminar(int idEquipo) {

    }
}
