package com.gestorinventario.services;

import com.gestorinventario.entity.AreasEntity;

import java.util.List;

public interface AreasService {

    List<AreasEntity> listado();
    AreasEntity registrar(AreasEntity areasEntity);
    AreasEntity modificar(int idArea, AreasEntity areasEntity);
    void eliminar(int idArea);
}
