package com.gestorinventario.services.impl;

import com.gestorinventario.dto.MarcaDto;
import com.gestorinventario.mapper.MarcaMapper;
import com.gestorinventario.repository.MarcaRepository;
import com.gestorinventario.services.MarcaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaServiceImpl implements MarcaService {

    private final MarcaRepository marcaRepository;
    private final MarcaMapper marcaMapper;

    public MarcaServiceImpl(MarcaRepository marcaRepository, MarcaMapper marcaMapper) {
        this.marcaRepository = marcaRepository;
        this.marcaMapper = marcaMapper;
    }

    @Override
    public List<MarcaDto> listado() {
        return this.marcaMapper.listadoDto(this.marcaRepository.findAll());
    }

    @Override
    public MarcaDto registrar(MarcaDto marcaDto) {
        return this.marcaMapper.marcaDto(this.marcaRepository.save(this.marcaMapper.marcaentity(marcaDto)));
    }

    @Override
    public MarcaDto modificar(Long idMarca, MarcaDto marcaDto) {
        if(idMarca!=null){
            return this.marcaMapper
                    .marcaDto(this.marcaRepository
                            .save(this.marcaMapper.marcaentity(marcaDto)));
        } else {
            return null;
        }
    }

    @Override
    public void eliminar(Long idMarca) {
        this.marcaRepository.deleteById(idMarca);
    }
}
