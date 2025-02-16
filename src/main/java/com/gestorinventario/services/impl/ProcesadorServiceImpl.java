package com.gestorinventario.services.impl;

import com.gestorinventario.entity.ProcesadorEntity;
import com.gestorinventario.services.ProcesadorService;

import java.util.List;

public class ProcesadorServiceImpl implements ProcesadorService {
    @Override
    public List<ProcesadorEntity> listado() {
        return List.of();
    }

    @Override
    public ProcesadorEntity registrar(ProcesadorEntity procesadorEntity) {
        return null;
    }

    @Override
    public ProcesadorEntity modificar(int idProcesador, ProcesadorEntity procesadorEntity) {
        return null;
    }

    @Override
    public void eliminar(int idProcesador) {

    }
}
