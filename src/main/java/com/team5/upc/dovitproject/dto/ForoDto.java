package com.team5.upc.dovitproject.dto;

import com.team5.upc.dovitproject.Model.Proyecto;
import com.team5.upc.dovitproject.Model.Publicaciones_Foro;
import jakarta.persistence.*;

import java.util.List;

public class ForoDto {
    private Integer id;
    private String titulo;
    private Integer idProyecto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }
}
