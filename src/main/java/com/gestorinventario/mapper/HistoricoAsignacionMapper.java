package com.gestorinventario.mapper;

import com.gestorinventario.dto.HistoricoAsignacionDto;
import com.gestorinventario.entity.HistoricoAsignacionEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HistoricoAsignacionMapper {

    @Mapping(target = "modeloEquipo", source = "equipoEntity.idUsuarioAsignado")
    @Mapping(target = "serieEquipo", source = "equipoEntity.serieEquipo")
    @Mapping(target = "modeloProcesador", source = "equipoEntity.procesadorEntity.modeloProcesador")
    @Mapping(target = "nombreMarca", source = "equipoEntity.marcaEntity.nombreMarca")
    @Mapping(target = "capacidadAlmacenamiento", source = "equipoEntity.almacenamientoEntity.capacidadAlmacenamiento")
    @Mapping(target = "tamanioMemoriaRam", source = "equipoEntity.memoriaRamEntity.tamanioMemoriaRam")
    @Mapping(target = "fechaIngresoEquipo", source = "equipoEntity.fechaIngresoEquipo")
    @Mapping(target = "fechaFabricacionEquipo", source = "equipoEntity.fechaFabricacionEquipo")
    @Mapping(target = "idEquipo", source = "equipoEntity.idEquipo")
    List<HistoricoAsignacionDto> listadoDto(List<HistoricoAsignacionEntity> historicoAsignacionEntities);

    @Mapping(target = "modeloEquipo", source = "equipoEntity.modeloEquipo")
    @Mapping(target = "serieEquipo", source = "equipoEntity.serieEquipo")
    @Mapping(target = "modeloProcesador", source = "equipoEntity.procesadorEntity.modeloProcesador")
    @Mapping(target = "nombreMarca", source = "equipoEntity.marcaEntity.nombreMarca")
    @Mapping(target = "capacidadAlmacenamiento", source = "equipoEntity.almacenamientoEntity.capacidadAlmacenamiento")
    @Mapping(target = "tamanioMemoriaRam", source = "equipoEntity.memoriaRamEntity.tamanioMemoriaRam")
    @Mapping(target = "fechaIngresoEquipo", source = "equipoEntity.fechaIngresoEquipo")
    @Mapping(target = "fechaFabricacionEquipo", source = "equipoEntity.fechaFabricacionEquipo")
    @Mapping(target = "idEquipo", source = "equipoEntity.idEquipo")
    HistoricoAsignacionDto historicoAsignacionDto (HistoricoAsignacionEntity historicoAsignacionEntity);


    @InheritInverseConfiguration
    HistoricoAsignacionEntity historiAsignacionEntity (HistoricoAsignacionDto historicoAsignacionDto);
}
