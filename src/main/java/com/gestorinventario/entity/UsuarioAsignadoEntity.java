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
    private int idUsuarioAsignado;

    @Column(name = "nombres_usuario")
    private String nombreUsuarioAsignado;
    @Column(name = "cargo_usuario")
    private String cargoUsuarioAsignado;
    @Column(name = "correo_usuario")
    private String correoUsuarioAsignado;

    @JoinColumn(name = "area")
    @ManyToOne()
    private AreasEntity areasEntity;

    @JoinColumn(name = "marca")
    @ManyToOne()
    private MarcaEntity marcaEntity;
}
