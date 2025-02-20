package com.gestorinventario.mapper;

import com.gestorinventario.dto.UsuarioAsignadoDto;
import com.gestorinventario.entity.UsuarioAsignadoEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", uses = {AreasMapper.class})
public interface UsuarioAsignadoMapper {

    @Mapping(target = "idArea", source = "areasEntity.idArea")
    List<UsuarioAsignadoDto> listadoDao(List<UsuarioAsignadoEntity> usuarioAsignadoEntities);
    @Mapping(target = "idArea", source = "areasEntity.idArea")
    UsuarioAsignadoDto usuarioAsignadoDao(UsuarioAsignadoEntity usuarioAsignadoEntity);

    @InheritInverseConfiguration
    UsuarioAsignadoEntity usuarioAsignadoEntity (UsuarioAsignadoDto usuarioAsignadoDto);

}