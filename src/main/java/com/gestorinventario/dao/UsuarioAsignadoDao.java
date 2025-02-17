package com.gestorinventario.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UsuarioAsignadoDao {

    private int idUsuarioAsignado;
    private String nombreUsuarioAsignado;
    private String cargoUsuarioAsignado;
    private String correoUsuarioAsignado;
    private int idAreas;
}
