package com.gestorinventario.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "tbl_equipo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EquipoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipo")
    private Long idEquipo;

    @Column(name = "modelo_equipo")
    private String modeloEquipo;
    @Column(name = "serie_equipo")
    private String serieEquipo;
    @Column(name = "fecha_ingreso_equipo")
    private LocalDate fechaIngresoEquipo;
    @Column(name = "fecha_fabricacion_equipo")
    private LocalDate fechaFabricacionEquipo;

    @JoinColumn(name = "almacenamiento")
    @ManyToOne()
    private AlmacenamientoEntity almacenamientoEntity;

    @JoinColumn(name = "procesador")
    @ManyToOne()
    private ProcesadorEntity procesadorEntity;

    @JoinColumn(name = "memoria_ram")
    @ManyToOne()
    private MemoriaRamEntity memoriaRamEntity;

    @JoinColumn(name = "marca")
    @ManyToOne()
    private MarcaEntity marcaEntity;

    @Column(name = "estado_equipo")
    private boolean estadoEquipo;
    @Column(name = "disponibilidad_equipo")
    private boolean disponibilidadEquipo;

    @JoinColumn(name = "historico")
    @ManyToOne
    private HistoricoEquiposEntity historicoEquiposEntity;
}
