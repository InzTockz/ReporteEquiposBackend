package com.gestorinventario.services;

import com.gestorinventario.entity.MarcaEntity;

import java.util.List;

public interface MarcaService {

    List<MarcaEntity> listado();
    MarcaEntity registrar(MarcaEntity marcaEntity);
    MarcaEntity modificar(int idMarca, MarcaEntity marcaEntity);
    void eliminar(int idMarca);
}
