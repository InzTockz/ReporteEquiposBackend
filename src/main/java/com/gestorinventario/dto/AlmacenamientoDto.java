package com.gestorinventario.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AlmacenamientoDto {

    private Long idAlmacenamiento;
    private String capacidadAlmacenamiento;
    private Long idTipoAlmacenamiento;
}
