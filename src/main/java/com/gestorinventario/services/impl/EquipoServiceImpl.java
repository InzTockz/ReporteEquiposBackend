package com.gestorinventario.services.impl;

import com.gestorinventario.dto.EquipoDto;
import com.gestorinventario.entity.EquipoEntity;
import com.gestorinventario.mapper.EquipoMapper;
import com.gestorinventario.repository.EquipoRepository;
import com.gestorinventario.services.EquipoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoServiceImpl implements EquipoService {

    private final EquipoRepository equipoRepository;
    private final EquipoMapper equipoMapper;

    public EquipoServiceImpl(EquipoRepository equipoRepository, EquipoMapper equipoMapper) {
        this.equipoRepository = equipoRepository;
        this.equipoMapper = equipoMapper;
    }

    @Override
    public List<EquipoDto> listado() {
        return this.equipoMapper.listadoDto(this.equipoRepository.findAll());
    }

    @Override
    public List<EquipoDto> listadoPorDisponibilidad() {
        return this.equipoMapper.listadoDto(this.equipoRepository.listadoPorDisponibilidad());
    }

    @Override
    public EquipoDto registrar(EquipoDto equipoDto) {
        return this.equipoMapper
                .equipoDao(this.equipoRepository
                        .save(this.equipoMapper.equipoEntity(equipoDto)));
    }

    @Override
    public EquipoDto modificar(Long idEquipo, EquipoDto equipoDto) {
        if(idEquipo!=null){
            return this.equipoMapper
                    .equipoDao(this.equipoRepository
                            .save(this.equipoMapper.equipoEntity(equipoDto)));
        } else {
            return null;
        }
    }

    @Override
    public void eliminar(Long idEquipo) {
        this.equipoRepository.deleteById(idEquipo);
    }

    @Override
    public EquipoDto buscarPorIdEquipo(Long idEquipo) {
        return this.equipoMapper.equipoDao(this.equipoRepository.findById(idEquipo).orElse(null));
    }

    @Override
    public List<EquipoDto> listadoPorIdUsuarioAsignado(Long idUsuarioAsignado) {
        return this.equipoMapper.listadoDto(this.equipoRepository.listadoEquiposPorId(idUsuarioAsignado));
    }

    @Override
    public List<EquipoDto> listadoEntreFechaDeFabricacion(Integer fechaIni, Integer fechaFin) {
        return this.equipoMapper.listadoDto(this.equipoRepository.listadoPorFechaDeFabricacion(fechaIni, fechaFin));
    }
}
