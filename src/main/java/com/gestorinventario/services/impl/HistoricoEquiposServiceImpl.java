package com.gestorinventario.services.impl;

import com.gestorinventario.dto.HistoricoEquipoDto;
import com.gestorinventario.mapper.HistoricoEquipoMapper;
import com.gestorinventario.repository.HistoricoEquiposRepository;
import com.gestorinventario.services.HistoricoEquiposService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoricoEquiposServiceImpl implements HistoricoEquiposService {

    private final HistoricoEquiposRepository historicoEquiposRepository;
    private final HistoricoEquipoMapper historicoEquipoMapper;

    public HistoricoEquiposServiceImpl(HistoricoEquiposRepository historicoEquiposRepository, HistoricoEquipoMapper historicoEquipoMapper) {
        this.historicoEquiposRepository = historicoEquiposRepository;
        this.historicoEquipoMapper = historicoEquipoMapper;
    }

    @Override
    public List<HistoricoEquipoDto> listado() {
        return this.historicoEquipoMapper.listadoDto(this.historicoEquiposRepository.findAll());
    }

    @Override
    public HistoricoEquipoDto registrar(HistoricoEquipoDto historicoEquipoDto) {
        return this.historicoEquipoMapper
                .historicoEquipoDto(this.historicoEquiposRepository
                        .save(this.historicoEquipoMapper
                                .historicoEquipoEntity(historicoEquipoDto)));
    }

    @Override
    public HistoricoEquipoDto modificar(Long idHistoricoEquipos, HistoricoEquipoDto historicoEquipoDto) {
        if(idHistoricoEquipos!=null){
            return this.historicoEquipoMapper
                    .historicoEquipoDto(this.historicoEquiposRepository
                            .save(this.historicoEquipoMapper
                                    .historicoEquipoEntity(historicoEquipoDto)));
        } else {
            return null;
        }
    }

    @Override
    public void eliminar(Long idHistoricoEquipos) {
        this.historicoEquiposRepository.deleteById(idHistoricoEquipos);
    }
}
