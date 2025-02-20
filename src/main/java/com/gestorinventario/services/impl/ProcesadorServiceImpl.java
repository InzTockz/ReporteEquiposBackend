package com.gestorinventario.services.impl;

import com.gestorinventario.dto.ProcesadorDto;
import com.gestorinventario.mapper.ProcesadorMapper;
import com.gestorinventario.repository.ProcesadorRepository;
import com.gestorinventario.services.ProcesadorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcesadorServiceImpl implements ProcesadorService {

    private final ProcesadorRepository procesadorRepository;
    private final ProcesadorMapper procesadorMapper;

    public ProcesadorServiceImpl(ProcesadorRepository procesadorRepository, ProcesadorMapper procesadorMapper) {
        this.procesadorRepository = procesadorRepository;
        this.procesadorMapper = procesadorMapper;
    }

    @Override
    public List<ProcesadorDto> listado() {
        return this.procesadorMapper.listadoDao(this.procesadorRepository.findAll());
    }

    @Override
    public ProcesadorDto registrar(ProcesadorDto procesadorDto) {
        return this.procesadorMapper.procesadorDao(this.procesadorRepository.save(this.procesadorMapper.procesadorEntity(procesadorDto)));
    }

    @Override
    public ProcesadorDto modificar(Long idProcesador, ProcesadorDto procesadorDto) {
        if(idProcesador!=null){
            return this.procesadorMapper
                    .procesadorDao(this.procesadorRepository
                            .save(this.procesadorMapper.procesadorEntity(procesadorDto)));
        } else {
            return null;
        }
    }

    @Override
    public void eliminar(Long idProcesador) {
        this.procesadorRepository.deleteById(idProcesador);
    }
}
