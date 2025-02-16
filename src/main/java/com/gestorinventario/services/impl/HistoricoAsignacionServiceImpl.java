package com.gestorinventario.services.impl;

import com.gestorinventario.entity.HistoricoAsignacionEntity;
import com.gestorinventario.services.HistoricoAsignacionService;

import java.util.List;

public class HistoricoAsignacionServiceImpl implements HistoricoAsignacionService {
    @Override
    public List<HistoricoAsignacionEntity> listado() {
        return List.of();
    }

    @Override
    public HistoricoAsignacionEntity registrar(HistoricoAsignacionEntity historicoAsignacionEntity) {
        return null;
    }

    @Override
    public HistoricoAsignacionEntity modificar(int idHistoricoAsignacion, HistoricoAsignacionEntity historicoAsignacionEntity) {
        return null;
    }

    @Override
    public void eliminar(int idHistoricoAsignacion) {

    }
}
