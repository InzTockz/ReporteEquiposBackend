package com.gestorinventario.services;

import com.gestorinventario.entity.AlmacenamientoEntity;

import java.util.List;

public interface AlmacenamientoService {

    List<AlmacenamientoEntity> listado();
    AlmacenamientoEntity registrar(AlmacenamientoEntity almacenamientoEntity);
    AlmacenamientoEntity modificar(int idAlmacenamiento, AlmacenamientoEntity almacenamientoEntity);
    void eliminar(int idAlmacenamiento);
}
