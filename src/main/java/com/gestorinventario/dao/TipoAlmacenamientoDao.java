package com.gestorinventario.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TipoAlmacenamientoDao {

    private int idTipoAlmacenamiento;
    private String descripcionTipoDeAlmacenamiento;
}
