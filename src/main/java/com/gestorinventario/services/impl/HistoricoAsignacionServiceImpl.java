package com.gestorinventario.services.impl;

import com.gestorinventario.dto.historicoAsignacion.HistoricoAsignacionListadoResponse;
import com.gestorinventario.dto.historicoAsignacion.HistoricoAsignacionRequest;
import com.gestorinventario.dto.historicoAsignacion.HistoricoAsignacionResponse;
import com.gestorinventario.entity.EquipoEntity;
import com.gestorinventario.entity.HistoricoAsignacionEntity;
import com.gestorinventario.entity.UsuarioAsignadoEntity;
import com.gestorinventario.mapper.HistoricoAsignacionMapper;
import com.gestorinventario.repository.EquipoRepository;
import com.gestorinventario.repository.HistoricoAsignacionRepository;
import com.gestorinventario.repository.UsuarioAsignadoRepository;
import com.gestorinventario.services.HistoricoAsignacionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistoricoAsignacionServiceImpl implements HistoricoAsignacionService {

    private final HistoricoAsignacionRepository historicoAsignacionRepository;
    private final HistoricoAsignacionMapper historicoAsignacionMapper;
    private final UsuarioAsignadoRepository usuarioAsignadoRepository;
    private final EquipoRepository equipoRepository;

    public HistoricoAsignacionServiceImpl(HistoricoAsignacionRepository historicoAsignacionRepository, HistoricoAsignacionMapper historicoAsignacionMapper, UsuarioAsignadoRepository usuarioAsignadoRepository, EquipoRepository equipoRepository) {
        this.historicoAsignacionRepository = historicoAsignacionRepository;
        this.historicoAsignacionMapper = historicoAsignacionMapper;
        this.usuarioAsignadoRepository = usuarioAsignadoRepository;
        this.equipoRepository = equipoRepository;
    }

    @Override
    public List<HistoricoAsignacionListadoResponse> listado() {
        return this.historicoAsignacionMapper.listadoDto(this.historicoAsignacionRepository.findAll());
    }

    @Override
    public HistoricoAsignacionResponse registrar(HistoricoAsignacionRequest historicoAsignacionRequest) {
        HistoricoAsignacionRequest asignacionRequest =
                new HistoricoAsignacionRequest(null,
                        historicoAsignacionRequest.idUsuarioAsignado(),
                        historicoAsignacionRequest.idEquipo(),
                        historicoAsignacionRequest.detalleHistorico(),
                        true
                        );

        UsuarioAsignadoEntity usuarioAsignadoEntity = this.usuarioAsignadoRepository.findById(historicoAsignacionRequest.idUsuarioAsignado()).orElse(null);
        usuarioAsignadoEntity.setEquipoAsignado(true);
        this.usuarioAsignadoRepository.save(usuarioAsignadoEntity);

        EquipoEntity equipoEntity = this.equipoRepository.findById(historicoAsignacionRequest.idEquipo()).orElse(null);
        equipoEntity.setDisponibilidadEquipo(false);
        this.equipoRepository.save(equipoEntity);

        return this.historicoAsignacionMapper
                .historicoAsignacionDto(this.historicoAsignacionRepository
                        .save(this.historicoAsignacionMapper
                                .historiAsignacionEntity(asignacionRequest)));
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
    }

    @Override
    public void eliminar(Long idHistoricoAsignacion) {
        this.historicoAsignacionRepository.deleteById(idHistoricoAsignacion);
    }

    @Override
    public HistoricoAsignacionListadoResponse buscarPorIdUsuarioAsignado(Long idUsuarioAsignado) {
        Optional<HistoricoAsignacionEntity> historicoAsignacionEntity = this.historicoAsignacionRepository.buscarPorIdUsuarioAsignado(idUsuarioAsignado);

        if(historicoAsignacionEntity.isPresent()){
            return this.historicoAsignacionMapper.listadoResponseDto(historicoAsignacionEntity.get());
        } else {
            return null;
        }
    }
}
