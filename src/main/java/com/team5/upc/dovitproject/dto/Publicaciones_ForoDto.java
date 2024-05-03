package com.team5.upc.dovitproject.dto;

import com.team5.upc.dovitproject.Model.Donante;
import com.team5.upc.dovitproject.Model.Foros;
import com.team5.upc.dovitproject.Model.Organizacion;
import io.swagger.models.auth.In;

public class Publicaciones_ForoDto {
    private Integer id;
    private String titulo;
    private String contenido;
    private Integer donante;
    private Integer organizacion;
    private Integer foros;

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public Integer getDonante() {
        return donante;
    }

    public Integer getOrganizacion() {
        return organizacion;
    }

    public Integer getForos() {
        return foros;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setDonante(Integer donante) {
        this.donante = donante;
    }

    public void setOrganizacion(Integer organizacion) {
        this.organizacion = organizacion;
    }

    public void setForos(Integer foros) {
        this.foros = foros;
    }
}
