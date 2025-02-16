package com.gestorinventario.repository;

import com.gestorinventario.entity.UsuarioAsignadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioAsignadoRepository extends JpaRepository<UsuarioAsignadoEntity, Integer> {
}
