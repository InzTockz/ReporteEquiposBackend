package com.gestorinventario.services.impl;

import com.gestorinventario.dto.GeneracionProcesadorDto;
import com.gestorinventario.mapper.GeneracionProcesadorMapper;
import com.gestorinventario.repository.GeneracionProcesadorRepository;
import com.gestorinventario.services.GeneracionProcesadorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneracionProcesadorServiceImpl implements GeneracionProcesadorService {

    private final GeneracionProcesadorRepository generacionProcesadorRepository;
    private final GeneracionProcesadorMapper generacionProcesadorMapper;

    public GeneracionProcesadorServiceImpl(GeneracionProcesadorRepository generacionProcesadorRepository, GeneracionProcesadorMapper generacionProcesadorMapper) {
        this.generacionProcesadorRepository = generacionProcesadorRepository;
        this.generacionProcesadorMapper = generacionProcesadorMapper;
    }

    @Override
    public List<GeneracionProcesadorDto> listado() {
        return this.generacionProcesadorMapper.listado(this.generacionProcesadorRepository.findAll());
    }

    @Override
    public GeneracionProcesadorDto registrar(GeneracionProcesadorDto generacionProcesadorDto) {
        return this.generacionProcesadorMapper
                .generacionProcesadorDto(this.generacionProcesadorRepository
                        .save(this.generacionProcesadorMapper
                                .generacionProcesadorEntity(generacionProcesadorDto)));
    }

    @Override
    public GeneracionProcesadorDto modificar(Long idGeneracionProcesador, GeneracionProcesadorDto generacionProcesadorDto) {
        if(idGeneracionProcesador!=null){
            return this.generacionProcesadorMapper
                    .generacionProcesadorDto(this.generacionProcesadorRepository
                            .save(this.generacionProcesadorMapper
                                    .generacionProcesadorEntity(generacionProcesadorDto)));
        } else {
            return null;
        }
    }

    @Override
    public void eliminar(Long idGeneracionProcesador) {
        this.generacionProcesadorRepository.deleteById(idGeneracionProcesador);
    }
}
