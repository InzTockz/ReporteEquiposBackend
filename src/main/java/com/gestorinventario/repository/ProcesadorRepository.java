package com.gestorinventario.repository;

import com.gestorinventario.entity.ProcesadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcesadorRepository extends JpaRepository<ProcesadorEntity, Integer> {
}
