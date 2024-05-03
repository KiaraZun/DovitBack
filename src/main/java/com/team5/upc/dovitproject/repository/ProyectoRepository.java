package com.team5.upc.dovitproject.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.team5.upc.dovitproject.Model.Proyecto;

import java.util.List;

@Repository
public interface ProyectoRepository extends CrudRepository<Proyecto, Integer> {
    //Buscar donante por departamento y distrito
    @Query("SELECT o FROM Proyecto o WHERE o.titulo = :titulo")
    List<Proyecto> findByNombre(@Param("titulo") String titulo);
}