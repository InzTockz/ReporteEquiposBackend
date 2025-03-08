package com.gestorinventario.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_historico_asignacion")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HistoricoAsignacionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historico")
    private Long idHistorico;

    @JoinColumn(name = "usuario_asignado")
    @ManyToOne()
    private UsuarioAsignadoEntity usuarioAsignadoEntity;

    @JoinColumn(name = "equipo")
    @ManyToOne()
    private EquipoEntity equipoEntity;

    @Column(name = "detalle_historico")
    private String detalleHistorico;

    @Column(name = "fecha_historico")
    @CreationTimestamp
    private LocalDate fechaHistorico;

    @Column(name = "estado_historico")
    private boolean estadoHistorico;
}
