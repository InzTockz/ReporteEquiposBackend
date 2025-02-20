package com.gestorinventario.mapper;

import com.gestorinventario.dto.ProcesadorDto;
import com.gestorinventario.entity.ProcesadorEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProcesadorMapper {

    @Mapping(target = "idGeneracionProcesador", source = "generacionProcesadorEntity.idGeneracionProcesador")
    @Mapping(target = "idMarca", source = "marcaEntity.idMarca")
    List<ProcesadorDto> listadoDao(List<ProcesadorEntity> procesadorEntities);

    @Mapping(target = "idGeneracionProcesador", source = "generacionProcesadorEntity.idGeneracionProcesador")
    @Mapping(target = "idMarca", source = "marcaEntity.idMarca")
    ProcesadorDto procesadorDao(ProcesadorEntity procesadorEntity);

    @InheritInverseConfiguration
    ProcesadorEntity procesadorEntity (ProcesadorDto procesadorDto);
}
