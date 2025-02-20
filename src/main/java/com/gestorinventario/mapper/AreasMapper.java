package com.gestorinventario.mapper;

import com.gestorinventario.dto.AreasDto;
import com.gestorinventario.entity.AreasEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AreasMapper {

    @Mappings({
            @Mapping(source = "idArea", target = "idArea"),
            @Mapping(source = "descripcionArea", target = "descripcionArea")
    })

    List<AreasDto> listadoDao(List<AreasEntity> areasEntities);
    AreasDto areaDao(AreasEntity areasEntity);
    @InheritInverseConfiguration
    AreasEntity areaEntity (AreasDto areasDto);
}
