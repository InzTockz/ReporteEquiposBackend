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
public class HistoricoAsignacionDao {

    private int idHistorico;
    private int idUsuarioAsignado;
    private int idEquipo;
    private String detalleHistorico;
    private LocalDate fechaHistorico;
    private boolean estadoHistorico;
}
