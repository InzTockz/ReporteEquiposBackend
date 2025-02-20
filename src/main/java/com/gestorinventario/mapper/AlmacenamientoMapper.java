package com.gestorinventario.mapper;

import com.gestorinventario.dto.AlmacenamientoDto;
import com.gestorinventario.entity.AlmacenamientoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AlmacenamientoMapper {

    @Mapping(target = "idTipoAlmacenamiento", source = "tipoAlmacenamientoEntity.idTipoAlmacenamiento")
    List<AlmacenamientoDto> listado(List<AlmacenamientoEntity> listadoAlmacenamiento);
    @Mapping(target = "idTipoAlmacenamiento", source = "tipoAlmacenamientoEntity.idTipoAlmacenamiento")
    AlmacenamientoDto almacenamientoDto (AlmacenamientoEntity almacenamientoEntity);

    @InheritInverseConfiguration
    AlmacenamientoEntity almacenamientoEntity (AlmacenamientoDto almacenamientoDto);
}
