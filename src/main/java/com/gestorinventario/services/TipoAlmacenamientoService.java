package com.gestorinventario.services;

import com.gestorinventario.dto.TipoAlmacenamientoDto;

import java.util.List;

public interface TipoAlmacenamientoService {

    List<TipoAlmacenamientoDto> listado();
    TipoAlmacenamientoDto registrar(TipoAlmacenamientoDto tipoAlmacenamientoDto);
    TipoAlmacenamientoDto modificar(Long idTipoAlmacenimiento, TipoAlmacenamientoDto tipoAlmacenamientoDto);
    void eliminar(Long idTipoAlmacenamiento);
}
