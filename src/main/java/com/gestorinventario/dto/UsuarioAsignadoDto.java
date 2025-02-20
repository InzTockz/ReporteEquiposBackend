package com.gestorinventario.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioAsignadoDto {

    private Long idUsuarioAsignado;
    private String nombreUsuarioAsignado;
    private String cargoUsuarioAsignado;
    private String correoUsuarioAsignado;
    //private AreasDto areasDto;
    private Long idArea;
}
