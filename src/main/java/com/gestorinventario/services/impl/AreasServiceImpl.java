package com.gestorinventario.services.impl;

import com.gestorinventario.entity.AreasEntity;
import com.gestorinventario.services.AreasService;

import java.util.List;

public class AreasServiceImpl implements AreasService {



    @Override
    public List<AreasEntity> listado() {
        return List.of();
    }

    @Override
    public AreasEntity registrar(AreasEntity areasEntity) {
        return null;
    }

    @Override
    public AreasEntity modificar(int idArea, AreasEntity areasEntity) {
        return null;
    }

    @Override
    public void eliminar(int idArea) {

    }
}
