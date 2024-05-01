package com.team5.upc.dovitproject.dto;

import com.team5.upc.dovitproject.Model.Donante;
import com.team5.upc.dovitproject.Model.Foros;
import com.team5.upc.dovitproject.Model.Organizacion;


public class Publicaciones_ForoDto {
    private Integer id;
    private String titulo;
    private String contenido;
    private Donante donante;
    private Organizacion organizacion;
    private Foros foros;

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public Donante getDonante() {
        return donante;
    }

    public Organizacion getOrganizacion() {
        return organizacion;
    }

    public Foros getForos() {
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

    public void setDonante(Donante donante) {
        this.donante = donante;
    }

    public void setOrganizacion(Organizacion organizacion) {
        this.organizacion = organizacion;
    }

    public void setForos(Foros foros) {
        this.foros = foros;
    }
}
