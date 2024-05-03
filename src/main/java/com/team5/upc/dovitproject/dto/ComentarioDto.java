package com.team5.upc.dovitproject.dto;

import com.team5.upc.dovitproject.Model.Donante;
import com.team5.upc.dovitproject.Model.Proyecto;

public class ComentarioDto {

    private Integer id;

    private String titulo;

    private String descripcion;


    private Integer idProyecto;

    private Integer idDonante;

    private Proyecto proyecto;

    private Donante donante;

    // Getters y Setters

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public Integer getIdDonante() {
        return idDonante;
    }

    public void setIdDonante(Integer idDonante) {
        this.idDonante = idDonante;
    }


    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Donante getDonante() {
        return donante;
    }

    public void setDonante(Donante donante) {
        this.donante = donante;
    }
}
