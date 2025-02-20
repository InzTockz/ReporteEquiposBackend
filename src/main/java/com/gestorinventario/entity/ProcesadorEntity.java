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
    private Long idProcesador;

    @Column(name = "modelo_procesador")
    private String modeloProcesador;

    @ManyToOne
    @JoinColumn(name = "generacion_procesador")
    private GeneracionProcesadorEntity generacionProcesadorEntity;

    @JoinColumn(name = "marca")
    @ManyToOne
    private MarcaEntity marcaEntity;
}
