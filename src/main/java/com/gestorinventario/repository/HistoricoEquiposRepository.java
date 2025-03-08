package com.gestorinventario.repository;

import com.gestorinventario.entity.HistoricoEquiposEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HistoricoEquiposRepository extends JpaRepository<HistoricoEquiposEntity, Long> {

    List<HistoricoEquiposEntity> findAllByEquipoEntityIdEquipo(Long idEquipo);

    @Query("SELECT he " +
            "FROM HistoricoEquiposEntity he " +
            "WHERE he.equipoEntity.idEquipo =:idEquipo")
    List<HistoricoEquiposEntity> listadoPorIdEquipo(@Param("idEquipo") Long idEquipo);
}
