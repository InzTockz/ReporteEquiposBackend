package com.gestorinventario.repository;

import com.gestorinventario.entity.UsuarioAsignadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsuarioAsignadoRepository extends JpaRepository<UsuarioAsignadoEntity, Long> {

    @Query("SELECT ua " +
            "FROM UsuarioAsignadoEntity ua " +
            "WHERE ua.areasEntity.idArea=:idArea")
    List<UsuarioAsignadoEntity> listadoPorArea(@Param("idArea") Long idArea);

    @Query("SELECT ua " +
            "FROM UsuarioAsignadoEntity ua " +
            "WHERE ua.equipoAsignado=false")
    List<UsuarioAsignadoEntity> listadoPorDisponibilidad();
}
