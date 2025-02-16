package com.gestorinventario.services.impl;

import com.gestorinventario.entity.MarcaEntity;
import com.gestorinventario.services.MarcaService;

import java.util.List;

public class MarcaServiceImpl implements MarcaService {
    @Override
    public List<MarcaEntity> listado() {
        return List.of();
    }

    @Override
    public MarcaEntity registrar(MarcaEntity marcaEntity) {
        return null;
    }

    @Override
    public MarcaEntity modificar(int idMarca, MarcaEntity marcaEntity) {
        return null;
    }

    @Override
    public void eliminar(int idMarca) {

    }
}
