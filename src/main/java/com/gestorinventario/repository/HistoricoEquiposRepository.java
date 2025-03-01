package com.gestorinventario.repository;

import com.gestorinventario.entity.HistoricoEquiposEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HistoricoEquiposRepository extends JpaRepository<HistoricoEquiposEntity, Long> {

    List<HistoricoEquiposEntity> findAllByEquipoEntityIdEquipo(Long idEquipo);
}
