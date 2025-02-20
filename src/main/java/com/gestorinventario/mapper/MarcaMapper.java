package com.gestorinventario.mapper;

import com.gestorinventario.dto.MarcaDto;
import com.gestorinventario.entity.MarcaEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MarcaMapper {

    List<MarcaDto> listadoDto(List<MarcaEntity> marcaEntities);
    MarcaDto marcaDto(MarcaEntity marcaEntity);
    @InheritInverseConfiguration
    MarcaEntity marcaentity (MarcaDto marcaDto);
}
