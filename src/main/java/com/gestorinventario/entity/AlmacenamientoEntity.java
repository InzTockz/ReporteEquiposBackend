package com.gestorinventario.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tbl_almacenamiento")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AlmacenamientoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_almacenamiento")
    private int id_almacenamiento;

    @Column(name = "capacidad_almacenamiento")
    private String capacidadAlmacenamiento;

    @JoinColumn(name = "tipo_Almacenamiento")
    @ManyToOne()
    private TipoAlmacenamientoEntity tipoAlmacenamientoEntity;
}
