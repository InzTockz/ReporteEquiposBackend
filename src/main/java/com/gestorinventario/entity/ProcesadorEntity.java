package com.gestorinventario.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tbl_procesador")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProcesadorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_procesador")
    private int idProcesador;

    @Column(name = "modelo_procesador")
    private String modeloProcesador;
    @Column(name = "generacion_procesador")
    private int generacionProcesador;

    @JoinColumn(name = "marca")
    @ManyToOne
    private MarcaEntity marcaEntity;
}
