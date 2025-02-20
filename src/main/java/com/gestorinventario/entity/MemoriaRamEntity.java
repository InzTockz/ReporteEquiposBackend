package com.gestorinventario.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tbl_memoria_ram")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemoriaRamEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_memoria_ram")
    private Long idMemoriaRam;

    @Column(name = "tamanio_memoria_ram")
    private String tamanioMemoriaRam;
}
