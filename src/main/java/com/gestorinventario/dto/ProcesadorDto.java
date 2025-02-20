package com.gestorinventario.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProcesadorDto {

    private Long idProcesador;
    private String modeloProcesador;
    private Long idGeneracionProcesador;
    private Long idMarca;
}
