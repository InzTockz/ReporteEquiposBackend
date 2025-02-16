package com.gestorinventario.services;

import com.gestorinventario.entity.UsuarioAsignadoEntity;

import java.util.List;

public interface UsuarioAsignadoService {

    List<UsuarioAsignadoEntity> listado();
    UsuarioAsignadoEntity registrar(UsuarioAsignadoEntity usuarioAsignadoEntity);
    UsuarioAsignadoEntity modificar(int idUsuarioAsingado, UsuarioAsignadoEntity usuarioAsignadoEntity);
    void eliminar(int idUsuarioAsignado);
}
