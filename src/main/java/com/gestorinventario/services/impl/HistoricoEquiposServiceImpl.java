package com.gestorinventario.services.impl;

import com.gestorinventario.entity.HistoricoEquiposEntity;
import com.gestorinventario.services.HistoricoEquiposService;

import java.util.List;

public class HistoricoEquiposServiceImpl implements HistoricoEquiposService {
    @Override
    public List<HistoricoEquiposEntity> listado() {
        return List.of();
    }

    @Override
    public HistoricoEquiposEntity registrar(HistoricoEquiposEntity historicoEquiposEntity) {
        return null;
    }

    @Override
    public HistoricoEquiposEntity modificar(int idHistoricoEquipos, HistoricoEquiposEntity historicoEquiposEntity) {
        return null;
    }

    @Override
    public void eliminar(int idHistoricoEquipos) {

    }
}
