package com.gestorinventario.repository;

import com.gestorinventario.entity.EquipoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EquipoRepository extends JpaRepository<EquipoEntity, Long> {

    @Query("SELECT e " +
            "FROM EquipoEntity e " +
            "INNER JOIN HistoricoAsignacionEntity ha ON ha.equipoEntity.idEquipo = e.idEquipo " +
            "WHERE ha.usuarioAsignadoEntity.idUsuarioAsignado =:idUsuarioAsignado")
    List<EquipoEntity> listadoEquiposPorId(@Param("idUsuarioAsignado") Long idUsuarioAsignado);

    @Query("SELECT e " +
            "FROM EquipoEntity e " +
            "WHERE e.disponibilidadEquipo=true")
    List<EquipoEntity> listadoPorDisponibilidad();

    @Query("SELECT e " +
            "FROM EquipoEntity e " +
            "WHERE YEAR(e.fechaFabricacionEquipo) BETWEEN :fechaIni AND :fechaFin")
    List<EquipoEntity> listadoPorFechaDeFabricacion(@Param("fechaIni") Integer fechaIni, @Param("fechaFin") Integer fechaFin);
}
