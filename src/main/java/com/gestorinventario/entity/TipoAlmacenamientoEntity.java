package com.gestorinventario.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tbl_tipo_almacenamiento")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TipoAlmacenamientoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_almacenamiento")
    private Long idTipoAlmacenamiento;
    @Column(name = "tipo_almacenamiento")
    private String descripciontipoDeAlmacenamiento;
}
