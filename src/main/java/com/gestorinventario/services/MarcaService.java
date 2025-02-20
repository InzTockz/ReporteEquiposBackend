package com.gestorinventario.services;

import com.gestorinventario.dto.MarcaDto;

import java.util.List;

public interface MarcaService {

    List<MarcaDto> listado();
    MarcaDto registrar(MarcaDto marcaDto);
    MarcaDto modificar(Long idMarca, MarcaDto marcaDto);
    void eliminar(Long idMarca);
}
