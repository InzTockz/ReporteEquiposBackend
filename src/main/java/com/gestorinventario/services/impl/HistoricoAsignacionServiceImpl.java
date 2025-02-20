package com.gestorinventario.services.impl;

import com.gestorinventario.dto.HistoricoAsignacionDto;
import com.gestorinventario.services.HistoricoAsignacionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoricoAsignacionServiceImpl implements HistoricoAsignacionService {
    @Override
    public List<HistoricoAsignacionDto> listado() {
        return List.of();
    }

    @Override
    public HistoricoAsignacionDto registrar(HistoricoAsignacionDto historicoAsignacionDto) {
        return null;
    }

    @Override
    public HistoricoAsignacionDto modificar(Long idHistoricoAsignacion, HistoricoAsignacionDto historicoAsignacionDto) {
        return null;
    }

    @Override
    public void eliminar(Long idHistoricoAsignacion) {

    }
}
