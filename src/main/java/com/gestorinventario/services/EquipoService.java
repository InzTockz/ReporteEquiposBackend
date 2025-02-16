package com.gestorinventario.services;

import com.gestorinventario.entity.EquipoEntity;

import java.util.List;

public interface EquipoService {

    List<EquipoEntity> listado();
    EquipoEntity registrar(EquipoEntity equipoEntity);
    EquipoEntity modificar(int idEquipo, EquipoEntity equipoEntity);
    void eliminar(int idEquipo);
}
