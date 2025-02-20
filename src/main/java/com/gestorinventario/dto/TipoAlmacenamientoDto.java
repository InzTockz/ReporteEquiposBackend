package com.gestorinventario.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoAlmacenamientoDto {

    private Long idTipoAlmacenamiento;
    private String descripciontipoDeAlmacenamiento;
}
