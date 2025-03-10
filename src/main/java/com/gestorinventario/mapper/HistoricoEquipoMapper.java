package com.gestorinventario.mapper;

import com.gestorinventario.dto.HistoricoEquipoDto;
import com.gestorinventario.dto.historicoEquipo.HistoricoEquipoListadoResponse;
import com.gestorinventario.entity.HistoricoEquiposEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HistoricoEquipoMapper {


    List<HistoricoEquipoListadoResponse> historicoEquipoListado(List<HistoricoEquiposEntity> historicoEquiposEntities);

    @Mapping(target = "modeloEquipo", source = "equipoEntity.modeloEquipo")
    @Mapping(target = "serieEquipo", source = "equipoEntity.serieEquipo")
    HistoricoEquipoListadoResponse historicoEquipoPersonalizado(HistoricoEquiposEntity historicoEquiposEntity);

    @Mapping(target = "idEquipo", source = "equipoEntity.idEquipo")
    List<HistoricoEquipoDto> listadoDto(List<HistoricoEquiposEntity> historicoEquiposEntities);

    @Mapping(target = "idEquipo", source = "equipoEntity.idEquipo")
    HistoricoEquipoDto historicoEquipoDto(HistoricoEquiposEntity historicoEquiposEntity);

    @Mapping(target = "equipoEntity.idEquipo", source = "idEquipo")
    HistoricoEquiposEntity historicoEquipoEntity (HistoricoEquipoDto historicoEquipoDto);
}
