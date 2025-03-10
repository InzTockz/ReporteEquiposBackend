package com.gestorinventario.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemoriaRamDto {

    private Long idMemoriaRam;
    private String tamanioMemoriaRam;
}
