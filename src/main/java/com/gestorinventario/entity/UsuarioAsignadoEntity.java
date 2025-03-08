package com.gestorinventario.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tbl_usuario_asignado")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UsuarioAsignadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario_asignado")
    private Long idUsuarioAsignado;
    @Column(name = "nombres_usuario")
    private String nombreUsuarioAsignado;
    @Column(name = "cargo_usuario")
    private String cargoUsuarioAsignado;
    @Column(name = "correo_usuario")
    private String correoUsuarioAsignado;
    @Column(name = "equipo_asignado")
    private boolean equipoAsignado;

    @ManyToOne()
    @JoinColumn(name = "area")
    private AreasEntity areasEntity;
}
