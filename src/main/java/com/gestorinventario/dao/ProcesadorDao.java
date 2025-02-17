package com.gestorinventario.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProcesadorDao {

    private int idProcesador;
    private String modeloProcesador;
    private int generacionProcesador;
    private int idMarca;
}
