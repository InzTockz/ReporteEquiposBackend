package com.gestorinventario.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AlmacenamientoDao {

    private int idAlmacenamiento;
    private String capacidadAlmacenamiento;
    private int idTipoAlmacenamiento;
}
