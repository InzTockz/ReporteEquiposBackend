package com.gestorinventario.repository;

import com.gestorinventario.entity.AlmacenamientoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlmacenamientoRepository extends JpaRepository<AlmacenamientoEntity, Long> {
}
