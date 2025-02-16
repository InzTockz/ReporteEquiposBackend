package com.gestorinventario.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

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
    private int idHistorico;

    @JoinColumn(name = "usuario_asignado")
    @ManyToOne()
    private UsuarioAsignadoEntity usuarioAsignadoEntity;

    @JoinColumn(name = "equipo")
    @ManyToOne()
    private EquipoEntity equipoEntity;

    @Column(name = "detalle_historico")
    private String detalleHistorico;

    @Column(name = "fecha_historico")
    private Date fechaHistorico;

    @Column(name = "estado_historico")
    private boolean estadoHistorico;
}
