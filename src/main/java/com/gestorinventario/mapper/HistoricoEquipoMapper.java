package com.gestorinventario.mapper;

import com.gestorinventario.dto.HistoricoEquipoDto;
import com.gestorinventario.entity.HistoricoEquiposEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HistoricoEquipoMapper {

    List<HistoricoEquipoDto> listadoDto(List<HistoricoEquiposEntity> historicoEquiposEntities);
    HistoricoEquipoDto historicoEquipoDto(HistoricoEquiposEntity historicoEquiposEntity);

    @InheritInverseConfiguration
    HistoricoEquiposEntity historicoEquipoEntity (HistoricoEquipoDto areasDao);
}
