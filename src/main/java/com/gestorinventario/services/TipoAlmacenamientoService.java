package com.gestorinventario.services;

import com.gestorinventario.entity.TipoAlmacenamientoEntity;

import java.util.List;

public interface TipoAlmacenamientoService {

    List<TipoAlmacenamientoEntity> listado();
    TipoAlmacenamientoEntity registrar(TipoAlmacenamientoEntity almacenamientoEntity);
    TipoAlmacenamientoEntity modificar(int idTipoAlmacenimiento, TipoAlmacenamientoEntity almacenamientoEntity);
    void eliminar(int idTipoAlmacenamiento);
}
