package com.gestorinventario.services.impl;

import com.gestorinventario.entity.AlmacenamientoEntity;
import com.gestorinventario.services.AlmacenamientoService;

import java.util.List;

public class AlmacenamientoServiceImpl implements AlmacenamientoService {
    @Override
    public List<AlmacenamientoEntity> listado() {
        return List.of();
    }

    @Override
    public AlmacenamientoEntity registrar(AlmacenamientoEntity almacenamientoEntity) {
        return null;
    }

    @Override
    public AlmacenamientoEntity modificar(int idAlmacenamiento, AlmacenamientoEntity almacenamientoEntity) {
        return null;
    }

    @Override
    public void eliminar(int idAlmacenamiento) {

    }
}
