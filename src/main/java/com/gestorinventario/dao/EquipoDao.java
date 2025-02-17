package com.gestorinventario.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EquipoDao {

    private int IdEquipo;
    private String modeloEquipo;
    private String serieEquipo;
    private LocalDate fechaIngresoEquipo;
    private LocalDate fechaFabricacionEquipo;
    private int idAlmacenamiento;
    private int idProcesador;
    private int idMarca;
    private boolean estadoEquipo;
    private boolean disponibilidadEquipo;
    private int idHistoricoEquipos;
}
