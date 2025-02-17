package com.gestorinventario.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MarcaDao {

    private int idMarca;
    private String nombreMarca;
}
