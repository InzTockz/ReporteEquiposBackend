package com.gestorinventario.services.impl;

import com.gestorinventario.entity.TipoAlmacenamientoEntity;
import com.gestorinventario.services.TipoAlmacenamientoService;

import java.util.List;

public class TipoAlmacenamientoServiceImpl implements TipoAlmacenamientoService {
    @Override
    public List<TipoAlmacenamientoEntity> listado() {
        return List.of();
    }

    @Override
    public TipoAlmacenamientoEntity registrar(TipoAlmacenamientoEntity almacenamientoEntity) {
        return null;
    }

    @Override
    public TipoAlmacenamientoEntity modificar(int idTipoAlmacenimiento, TipoAlmacenamientoEntity almacenamientoEntity) {
        return null;
    }

    @Override
    public void eliminar(int idTipoAlmacenamiento) {

    }
}
