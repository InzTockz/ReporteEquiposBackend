package com.gestorinventario.mapper;

import com.gestorinventario.dto.EquipoDto;
import com.gestorinventario.entity.EquipoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EquipoMapper {

    @Mapping(target = "idAlmacenamiento", source = "almacenamientoEntity.idAlmacenamiento")
    @Mapping(target = "idProcesador", source = "procesadorEntity.idProcesador")
    @Mapping(target = "idMemoriaRam", source = "memoriaRamEntity.idMemoriaRam")
    @Mapping(target = "idMarca", source = "marcaEntity.idMarca")
    @Mapping(target = "idHistoricoEquipos", source = "historicoEquiposEntity.idHistoricoEquipos")
    List<EquipoDto> listadoDto(List<EquipoEntity> equipoEntities);

    @Mapping(target = "idAlmacenamiento", source = "almacenamientoEntity.idAlmacenamiento")
    @Mapping(target = "idProcesador", source = "procesadorEntity.idProcesador")
    @Mapping(target = "idMemoriaRam", source = "memoriaRamEntity.idMemoriaRam")
    @Mapping(target = "idMarca", source = "marcaEntity.idMarca")
    @Mapping(target = "idHistoricoEquipos", source = "historicoEquiposEntity.idHistoricoEquipos")
    EquipoDto equipoDao(EquipoEntity equipoEntity);

    @InheritInverseConfiguration
    EquipoEntity equipoEntity(EquipoDto equipoDto);
}
