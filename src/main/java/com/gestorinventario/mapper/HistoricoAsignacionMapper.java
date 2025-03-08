package com.gestorinventario.mapper;

import com.gestorinventario.dto.historicoAsignacion.HistoricoAsignacionListadoResponse;
import com.gestorinventario.dto.historicoAsignacion.HistoricoAsignacionRequest;
import com.gestorinventario.dto.historicoAsignacion.HistoricoAsignacionResponse;
import com.gestorinventario.entity.HistoricoAsignacionEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HistoricoAsignacionMapper {

    /*
    @Mapping(target = "modeloEquipo", source = "equipoEntity.modeloEquipo")
    @Mapping(target = "serieEquipo", source = "equipoEntity.serieEquipo")
    @Mapping(target = "modeloProcesador", source = "equipoEntity.procesadorEntity.modeloProcesador")
    @Mapping(target = "nombreMarca", source = "equipoEntity.marcaEntity.nombreMarca")
    @Mapping(target = "capacidadAlmacenamiento", source = "equipoEntity.almacenamientoEntity.capacidadAlmacenamiento")
    @Mapping(target = "tamanioMemoriaRam", source = "equipoEntity.memoriaRamEntity.tamanioMemoriaRam")
    @Mapping(target = "fechaIngresoEquipo", source = "equipoEntity.fechaIngresoEquipo")
    @Mapping(target = "fechaFabricacionEquipo", source = "equipoEntity.fechaFabricacionEquipo")
    @Mapping(target = "idEquipo", source = "equipoEntity.idEquipo") */
    List<HistoricoAsignacionListadoResponse> listadoDto(List<HistoricoAsignacionEntity> historicoAsignacionEntities);

    @Mapping(target = "modeloEquipo", source = "equipoEntity.modeloEquipo")
    @Mapping(target = "serieEquipo", source = "equipoEntity.serieEquipo")
    @Mapping(target = "modeloProcesador", source = "equipoEntity.procesadorEntity.modeloProcesador")
    @Mapping(target = "nombreMarca", source = "equipoEntity.marcaEntity.nombreMarca")
    @Mapping(target = "capacidadAlmacenamiento", source = "equipoEntity.almacenamientoEntity.capacidadAlmacenamiento")
    @Mapping(target = "tamanioMemoriaRam", source = "equipoEntity.memoriaRamEntity.tamanioMemoriaRam")
    @Mapping(target = "fechaIngresoEquipo", source = "equipoEntity.fechaIngresoEquipo")
    @Mapping(target = "fechaFabricacionEquipo", source = "equipoEntity.fechaFabricacionEquipo")
    @Mapping(target = "idEquipo", source = "equipoEntity.idEquipo")
    @Mapping(target = "nombreUsuarioAsignado", source = "usuarioAsignadoEntity.nombreUsuarioAsignado")
    HistoricoAsignacionListadoResponse listadoResponseDto(HistoricoAsignacionEntity historicoAsignacionEntity);

    @Mapping(target = "idUsuarioAsignado", source = "usuarioAsignadoEntity.idUsuarioAsignado")
    @Mapping(target = "idEquipo", source = "equipoEntity.idEquipo")
    HistoricoAsignacionResponse historicoAsignacionDto (HistoricoAsignacionEntity historicoAsignacionEntity);

    @Mapping(target = "usuarioAsignadoEntity.idUsuarioAsignado", source = "idUsuarioAsignado")
    @Mapping(target = "equipoEntity.idEquipo", source = "idEquipo")
    HistoricoAsignacionEntity historiAsignacionEntity (HistoricoAsignacionRequest historicoAsignacionDto);

}
