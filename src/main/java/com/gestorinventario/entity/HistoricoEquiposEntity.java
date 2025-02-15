package com.gestorinventario.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Entity
@Table(name = "tbl_historicos_equipo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HistoricoEquiposEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historico_equipos")
    private int idHistoricoEquipos;

    @Column(name = "observacion_equipos")
    private String observacionEquipos;

    @Column(name = "fecha_historico_equipos")
    private Date fechaHistoricoEquipos;
}
