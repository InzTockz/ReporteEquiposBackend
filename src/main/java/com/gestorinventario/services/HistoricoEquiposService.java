package com.gestorinventario.services;

import com.gestorinventario.entity.HistoricoEquiposEntity;

import java.util.List;

public interface HistoricoEquiposService {

    List<HistoricoEquiposEntity> listado();
    HistoricoEquiposEntity registrar(HistoricoEquiposEntity historicoEquiposEntity);
    HistoricoEquiposEntity modificar(int idHistoricoEquipos, HistoricoEquiposEntity historicoEquiposEntity);
    void eliminar(int idHistoricoEquipos);
}
