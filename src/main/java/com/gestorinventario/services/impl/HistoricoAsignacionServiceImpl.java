package com.gestorinventario.services.impl;

import com.gestorinventario.dto.HistoricoAsignacionDto;
import com.gestorinventario.mapper.HistoricoAsignacionMapper;
import com.gestorinventario.repository.HistoricoAsignacionRepository;
import com.gestorinventario.services.HistoricoAsignacionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoricoAsignacionServiceImpl implements HistoricoAsignacionService {

    private final HistoricoAsignacionRepository historicoAsignacionRepository;
    private final HistoricoAsignacionMapper historicoAsignacionMapper;

    public HistoricoAsignacionServiceImpl(HistoricoAsignacionRepository historicoAsignacionRepository, HistoricoAsignacionMapper historicoAsignacionMapper) {
        this.historicoAsignacionRepository = historicoAsignacionRepository;
        this.historicoAsignacionMapper = historicoAsignacionMapper;
    }

    @Override
    public List<HistoricoAsignacionDto> listado() {
        return this.historicoAsignacionMapper.listadoDto(this.historicoAsignacionRepository.findAll());
    }

    @Override
    public HistoricoAsignacionDto registrar(HistoricoAsignacionDto historicoAsignacionDto) {
        return this.historicoAsignacionMapper
                .historicoAsignacionDto(this.historicoAsignacionRepository
                        .save(this.historicoAsignacionMapper
                                .historiAsignacionEntity(historicoAsignacionDto)));
    }

    @Override
    public HistoricoAsignacionDto modificar(Long idHistoricoAsignacion, HistoricoAsignacionDto historicoAsignacionDto) {
        if(idHistoricoAsignacion!=null){
            return this.historicoAsignacionMapper
                    .historicoAsignacionDto(this.historicoAsignacionRepository
                            .save(this.historicoAsignacionMapper
                                    .historiAsignacionEntity(historicoAsignacionDto)));
        } else {
            return null;
        }
    }

    @Override
    public void eliminar(Long idHistoricoAsignacion) {
        this.historicoAsignacionRepository.deleteById(idHistoricoAsignacion);
    }
}
