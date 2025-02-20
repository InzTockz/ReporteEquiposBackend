package com.gestorinventario.mapper;

import com.gestorinventario.dto.MarcaDto;
import com.gestorinventario.dto.MemoriaRamDto;
import com.gestorinventario.entity.MarcaEntity;
import com.gestorinventario.entity.MemoriaRamEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MemoriaRamMapper {

    List<MemoriaRamDto> listadoDao(List<MemoriaRamEntity> memoriaRamEntities);
    MemoriaRamDto memoriaRamDto(MemoriaRamEntity memoriaRamEntity);

    @InheritInverseConfiguration
    MemoriaRamEntity memoriaRamEntity(MemoriaRamDto memoriaRamDto);
}
