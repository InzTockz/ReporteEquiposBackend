package com.gestorinventario.services.impl;

import com.gestorinventario.dto.AreasDto;
import com.gestorinventario.mapper.AreasMapper;
import com.gestorinventario.repository.AreasRepository;
import com.gestorinventario.services.AreasService;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreasServiceImpl implements AreasService {

    private final AreasRepository areasRepository;
    private final AreasMapper areasMapper;

    public AreasServiceImpl(AreasRepository areasRepository, AreasMapper areasMapper) {
        this.areasRepository = areasRepository;
        this.areasMapper = areasMapper;
    }

    @Override
    public List<AreasDto> listado() {
        return areasMapper.listadoDao(this.areasRepository.findAll());
    }

    @Override
    public AreasDto registrar(AreasDto areasDto) {
        return areasMapper.areaDao(this.areasRepository.save(this.areasMapper.areaEntity(areasDto)));
    }

    @Override
    public AreasDto modificar(Long idArea, AreasDto areasDto) {
        if(idArea!=null){
            return this.areasMapper.areaDao(this.areasRepository.save(this.areasMapper.areaEntity(areasDto)));
        } else {
            return null;
        }
    }

    @Override
    public void eliminar(Long idArea) {
        this.areasRepository.deleteById(idArea);
    }

    @Override
    public List<AreasDto> listadoPorId(Long idArea) {
        return this.areasMapper.listadoDao(this.areasRepository.listadoPorId(idArea));
    }
}
