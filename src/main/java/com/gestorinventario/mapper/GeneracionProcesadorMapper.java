package com.gestorinventario.mapper;

import com.gestorinventario.dto.GeneracionProcesadorDto;
import com.gestorinventario.entity.GeneracionProcesadorEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface GeneracionProcesadorMapper {

    List<GeneracionProcesadorDto> listado(List<GeneracionProcesadorEntity> generacionProcesadorEntities);
    GeneracionProcesadorDto generacionProcesadorDto (GeneracionProcesadorEntity generacionProcesadorEntity);

    @InheritInverseConfiguration
    GeneracionProcesadorEntity generacionProcesadorEntity (GeneracionProcesadorDto generacionProcesadorDto);
}
