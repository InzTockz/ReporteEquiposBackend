package com.gestorinventario.services.impl;

import com.gestorinventario.entity.UsuarioAsignadoEntity;
import com.gestorinventario.services.UsuarioAsignadoService;

import java.util.List;

public class UsuarioAsignadoServiceImpl implements UsuarioAsignadoService {
    @Override
    public List<UsuarioAsignadoEntity> listado() {
        return List.of();
    }

    @Override
    public UsuarioAsignadoEntity registrar(UsuarioAsignadoEntity usuarioAsignadoEntity) {
        return null;
    }

    @Override
    public UsuarioAsignadoEntity modificar(int idUsuarioAsingado, UsuarioAsignadoEntity usuarioAsignadoEntity) {
        return null;
    }

    @Override
    public void eliminar(int idUsuarioAsignado) {

    }
}
