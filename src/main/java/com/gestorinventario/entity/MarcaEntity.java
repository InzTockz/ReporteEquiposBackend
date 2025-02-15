package com.gestorinventario.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_marca")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MarcaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_marca")
    private int idMarca;

    @Column(name = "nombre_marca")
    private String nombreMarca;
}
