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

    @Mapping(target = "idUsuarioAsignado", source = "usuarioAsignadoEntity.idUsuarioAsignado")
    @Mapping(target = "idEquipo", source = "equipoEntity.idEquipo")
    List<HistoricoAsignacionDto> listadoDto(List<HistoricoAsignacionEntity> historicoAsignacionEntities);

    @Mapping(target = "idUsuarioAsignado", source = "usuarioAsignadoEntity.idUsuarioAsignado")
    @Mapping(target = "idEquipo", source = "equipoEntity.idEquipo")
    HistoricoAsignacionDto historicoAsignacionDto (HistoricoAsignacionEntity historicoAsignacionEntity);

    @InheritInverseConfiguration
    HistoricoAsignacionEntity historiAsignacionEntity (HistoricoAsignacionDto historicoAsignacionDto);
}
