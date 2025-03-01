package com.gestorinventario.repository;

import com.gestorinventario.entity.AreasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AreasRepository extends JpaRepository<AreasEntity, Long> {

    @Query("SELECT a " +
            "FROM AreasEntity a " +
            "WHERE a.idArea=:idArea")
    List<AreasEntity> listadoPorId(@Param("idArea") Long idArea);
}
