package com.gestorinventario.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HistoricoEquipoDao {

    private int idHistoricoEquipos;
    private String observacionEquipos;
    private LocalDate fechaHistoricoEquipos;
}
