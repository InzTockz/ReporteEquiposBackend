package com.gestorinventario.services.impl;

import com.gestorinventario.dto.AlmacenamientoDto;
import com.gestorinventario.mapper.AlmacenamientoMapper;
import com.gestorinventario.repository.AlmacenamientoRepository;
import com.gestorinventario.services.AlmacenamientoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlmacenamientoServiceImpl implements AlmacenamientoService {

    private final AlmacenamientoRepository almacenamientoRepository;
    private final AlmacenamientoMapper almacenamientoMapper;

    public AlmacenamientoServiceImpl(AlmacenamientoRepository almacenamientoRepository, AlmacenamientoMapper almacenamientoMapper) {
        this.almacenamientoRepository = almacenamientoRepository;
        this.almacenamientoMapper = almacenamientoMapper;
    }

    @Override
    public List<AlmacenamientoDto> listado() {
        return this.almacenamientoMapper.listado(this.almacenamientoRepository.findAll());
    }

    @Override
    public AlmacenamientoDto registrar(AlmacenamientoDto almacenamientoDto) {
        return this.almacenamientoMapper.almacenamientoDto(this.almacenamientoRepository.save(this.almacenamientoMapper.almacenamientoEntity(almacenamientoDto)));
    }

    @Override
    public AlmacenamientoDto modificar(Long idAlmacenamiento, AlmacenamientoDto almacenamientoDto) {
        if(idAlmacenamiento!=null){
            return this.almacenamientoMapper
                    .almacenamientoDto(this.almacenamientoRepository
                            .save(this.almacenamientoMapper
                                    .almacenamientoEntity(almacenamientoDto)));
        } else {
            return null;
        }
    }

    @Override
    public void eliminar(Long idAlmacenamiento) {
        this.almacenamientoRepository.deleteById(idAlmacenamiento);
    }
}
