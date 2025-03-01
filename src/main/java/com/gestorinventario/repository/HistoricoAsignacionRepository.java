package com.gestorinventario.repository;

import com.gestorinventario.entity.HistoricoAsignacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface HistoricoAsignacionRepository extends JpaRepository<HistoricoAsignacionEntity, Long> {

    @Query("SELECT ha " +
            "FROM HistoricoAsignacionEntity ha " +
            "WHERE ha.usuarioAsignadoEntity.idUsuarioAsignado =:idUsuarioAsignado")
    Optional<HistoricoAsignacionEntity> buscarPorIdUsuarioAsignado(@Param("idUsuarioAsignado") Long idUsuarioAsignado);
}
