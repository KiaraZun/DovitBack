package com.team5.upc.dovitproject.repository;

import com.team5.upc.dovitproject.Model.Comentarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ComentarioRepository extends JpaRepository<Comentarios, Integer> {
    @Query("SELECT c FROM Comentarios c WHERE c.proyecto.id = :idProyecto")
    List<Comentarios> findAllByProyectoId(Integer idProyecto);
}
