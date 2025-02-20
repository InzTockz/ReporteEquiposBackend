package com.gestorinventario.services;

import com.gestorinventario.dto.AlmacenamientoDto;

import java.util.List;

public interface AlmacenamientoService {

    List<AlmacenamientoDto> listado();
    AlmacenamientoDto registrar(AlmacenamientoDto almacenamientoDto);
    AlmacenamientoDto modificar(Long idAlmacenamiento, AlmacenamientoDto almacenamientoDto);
    void eliminar(Long idAlmacenamiento);
}
