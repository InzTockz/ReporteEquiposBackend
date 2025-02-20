package com.gestorinventario.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tbl_generacion_procesador")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GeneracionProcesadorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_generacion_procesador")
    private Long idGeneracionProcesador;

    @Column(name = "descripcion_generacion_procesador")
    private String descripcionGeneracionProcesador;
}
