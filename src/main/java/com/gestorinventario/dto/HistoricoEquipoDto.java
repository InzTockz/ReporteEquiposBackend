package com.gestorinventario.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HistoricoEquipoDto {
    private Long idHistoricoEquipos;
    private String observacionEquipos;
    private LocalDate fechaHistoricoEquipos;
    private Long idEquipo;
}
