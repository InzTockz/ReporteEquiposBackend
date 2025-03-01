package com.gestorinventario.mapper;

import com.gestorinventario.dto.UsuarioAsignadoDto;
import com.gestorinventario.entity.UsuarioAsignadoEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", uses = {AreasMapper.class})
public interface UsuarioAsignadoMapper {

    @Mapping(target = "idArea", source = "areasEntity.idArea")
    @Mapping(target = "descripcionArea", source = "areasEntity.descripcionArea")
    List<UsuarioAsignadoDto> listadoDao(List<UsuarioAsignadoEntity> usuarioAsignadoEntities);

    @Mapping(target = "idArea", source = "areasEntity.idArea")
    @Mapping(target = "descripcionArea", source = "areasEntity.descripcionArea")
    UsuarioAsignadoDto usuarioAsignadoDao(UsuarioAsignadoEntity usuarioAsignadoEntity);

    @InheritInverseConfiguration
    UsuarioAsignadoEntity usuarioAsignadoEntity (UsuarioAsignadoDto usuarioAsignadoDto);

}