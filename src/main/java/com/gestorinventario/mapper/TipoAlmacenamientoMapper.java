package com.gestorinventario.mapper;

import com.gestorinventario.dto.TipoAlmacenamientoDto;
import com.gestorinventario.entity.TipoAlmacenamientoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TipoAlmacenamientoMapper {

    List<TipoAlmacenamientoDto> listadoDao(List<TipoAlmacenamientoEntity> tipoAlmacenamientoEntities);
    TipoAlmacenamientoDto tipoAlmacenamientoDao(TipoAlmacenamientoEntity tipoAlmacenamientoEntity);
    @InheritInverseConfiguration
    TipoAlmacenamientoEntity tipoAlmacenamientoEntity (TipoAlmacenamientoDto tipoAlmacenamientoDto);
}
