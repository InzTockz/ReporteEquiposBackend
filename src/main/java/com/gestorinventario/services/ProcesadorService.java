package com.gestorinventario.services;

import com.gestorinventario.entity.ProcesadorEntity;

import java.util.List;

public interface ProcesadorService {

    List<ProcesadorEntity> listado();
    ProcesadorEntity registrar(ProcesadorEntity procesadorEntity);
    ProcesadorEntity modificar(int idProcesador, ProcesadorEntity procesadorEntity);
    void eliminar(int idProcesador);
}
