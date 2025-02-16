package com.gestorinventario.repository;

import com.gestorinventario.entity.MemoriaRamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoriaRamRepository extends JpaRepository<MemoriaRamEntity, Integer> {
}
