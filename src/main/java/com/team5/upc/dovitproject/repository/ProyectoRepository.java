package com.team5.upc.dovitproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.team5.upc.dovitproject.Model.Proyecto;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Integer>{
    
}
