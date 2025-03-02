package com.gestorinventario.services.impl;

import com.gestorinventario.dto.historicoAsignacion.HistoricoAsignacionDto;
import com.gestorinventario.dto.historicoAsignacion.HistoricoAsignacionListadoResponse;
import com.gestorinventario.dto.historicoAsignacion.HistoricoAsignacionRequest;
import com.gestorinventario.dto.historicoAsignacion.HistoricoAsignacionResponse;
import com.gestorinventario.entity.HistoricoAsignacionEntity;
import com.gestorinventario.mapper.HistoricoAsignacionMapper;
import com.gestorinventario.repository.HistoricoAsignacionRepository;
import com.gestorinventario.services.HistoricoAsignacionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistoricoAsignacionServiceImpl implements HistoricoAsignacionService {

    private final HistoricoAsignacionRepository historicoAsignacionRepository;
    private final HistoricoAsignacionMapper historicoAsignacionMapper;

    public HistoricoAsignacionServiceImpl(HistoricoAsignacionRepository historicoAsignacionRepository, HistoricoAsignacionMapper historicoAsignacionMapper) {
        this.historicoAsignacionRepository = historicoAsignacionRepository;
        this.historicoAsignacionMapper = historicoAsignacionMapper;
    }

    @Override
    public List<HistoricoAsignacionListadoResponse> listado() {
        return this.historicoAsignacionMapper.listadoDto(this.historicoAsignacionRepository.findAll());
    }

    @Override
    public HistoricoAsignacionResponse registrar(HistoricoAsignacionRequest historicoAsignacionRequest) {
        return this.historicoAsignacionMapper
                .historicoAsignacionDto(this.historicoAsignacionRepository
                        .save(this.historicoAsignacionMapper
                                .historiAsignacionEntity(historicoAsignacionRequest)));
        //return null;
    }

    @Override
    public HistoricoAsignacionResponse modificar(Long idHistoricoAsignacion, HistoricoAsignacionRequest historicoAsignacionRequest) {
        if(idHistoricoAsignacion!=null){
            return this.historicoAsignacionMapper
                    .historicoAsignacionDto(this.historicoAsignacionRepository
                            .save(this.historicoAsignacionMapper
                                    .historiAsignacionEntity(historicoAsignacionRequest)));
        } else {
            return null;
        }

        //return null;
    }

    @Override
    public void eliminar(Long idHistoricoAsignacion) {
        this.historicoAsignacionRepository.deleteById(idHistoricoAsignacion);
    }

    @Override
    public HistoricoAsignacionResponse buscarPorIdUsuarioAsignado(Long idUsuarioAsignado) {
        Optional<HistoricoAsignacionEntity> historicoAsignacionEntity = this.historicoAsignacionRepository.buscarPorIdUsuarioAsignado(idUsuarioAsignado);

        if(historicoAsignacionEntity.isPresent()){
            return this.historicoAsignacionMapper.historicoAsignacionDto(historicoAsignacionEntity.get());
        } else {
            return null;
        }
    }
}
