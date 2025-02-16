package com.gestorinventario.repository;

import com.gestorinventario.entity.MarcaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<MarcaEntity, Integer> {
}
