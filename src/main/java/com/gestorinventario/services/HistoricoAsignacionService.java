package com.gestorinventario.services;

import com.gestorinventario.entity.HistoricoAsignacionEntity;

import java.util.List;

public interface HistoricoAsignacionService {

    List<HistoricoAsignacionEntity> listado();
    HistoricoAsignacionEntity registrar(HistoricoAsignacionEntity historicoAsignacionEntity);
    HistoricoAsignacionEntity modificar(int idHistoricoAsignacion, HistoricoAsignacionEntity historicoAsignacionEntity);
    void eliminar(int idHistoricoAsignacion);
}
