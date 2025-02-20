package com.gestorinventario.services.impl;

import com.gestorinventario.dto.MemoriaRamDto;
import com.gestorinventario.mapper.MemoriaRamMapper;
import com.gestorinventario.repository.MemoriaRamRepository;
import com.gestorinventario.services.MemoriaRamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoriaRamServiceImpl implements MemoriaRamService {

    private final MemoriaRamRepository memoriaRamRepository;
    private final MemoriaRamMapper memoriaRamMapper;

    public MemoriaRamServiceImpl(MemoriaRamRepository memoriaRamRepository, MemoriaRamMapper memoriaRamMapper) {
        this.memoriaRamRepository = memoriaRamRepository;
        this.memoriaRamMapper = memoriaRamMapper;
    }

    @Override
    public List<MemoriaRamDto> listado() {
        return this.memoriaRamMapper.listadoDao(this.memoriaRamRepository.findAll());
    }

    @Override
    public MemoriaRamDto registrar(MemoriaRamDto memoriaRamDto) {
        return this.memoriaRamMapper.memoriaRamDto(this.memoriaRamRepository.save(this.memoriaRamMapper.memoriaRamEntity(memoriaRamDto)));
    }

    @Override
    public MemoriaRamDto modificar(Long idMemoriaRam, MemoriaRamDto memoriaRamDto) {
        if(idMemoriaRam!=null){
            return this.memoriaRamMapper
                    .memoriaRamDto(this.memoriaRamRepository
                            .save(this.memoriaRamMapper
                                    .memoriaRamEntity(memoriaRamDto)));
        } else {
            return null;
        }
    }

    @Override
    public void eliminar(Long idMemoriaRam) {
        this.memoriaRamRepository.deleteById(idMemoriaRam);
    }
}
