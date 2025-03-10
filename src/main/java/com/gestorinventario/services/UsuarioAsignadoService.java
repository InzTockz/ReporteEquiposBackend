package com.gestorinventario.services;

import com.gestorinventario.dto.UsuarioAsignadoDto;

import java.util.List;

public interface UsuarioAsignadoService {

    List<UsuarioAsignadoDto> listado();
    List<UsuarioAsignadoDto> listadoPorDisponibilidad();
    UsuarioAsignadoDto registrar(UsuarioAsignadoDto usuarioAsignadoDto);
    UsuarioAsignadoDto modificar(Long idUsuarioAsingado, UsuarioAsignadoDto usuarioAsignadoDto);
    void eliminar(Long idUsuarioAsignado);
    List<UsuarioAsignadoDto> listadoPorId(Long idUsuarioAsignado);
}
