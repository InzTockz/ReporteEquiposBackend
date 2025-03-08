package com.gestorinventario.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "tbl_historico_equipos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HistoricoEquiposEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historico_equipos")
    private Long idHistoricoEquipos;

    @Column(name = "observacion_equipos")
    private String observacionEquipos;

    @Column(name = "fecha_historico_equipos")
    @CreationTimestamp
    private LocalDate fechaHistoricoEquipos;

    @ManyToOne()
    @JoinColumn(name = "equipo")
    private EquipoEntity equipoEntity;
}
