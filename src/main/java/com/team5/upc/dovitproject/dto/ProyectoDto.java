package com.team5.upc.dovitproject.dto;

import java.util.Date;

public class ProyectoDto {
    private Integer id;
    private String titulo;
    private String descripcion;
    private String estado;
    private Integer montoObjetivo;
    private Date fechaInicio;
    private Date fechaFin;
    private String categoria;
    private Integer idOrganizacionBenefica;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public Integer getMontoObjetivo() { return montoObjetivo; }
    public void setMontoObjetivo(Integer montoObjetivo) { this.montoObjetivo = montoObjetivo; }

    public Date getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(Date fechaInicio) { this.fechaInicio = fechaInicio; }

    public Date getFechaFin() { return fechaFin; }
    public void setFechaFin(Date fechaFin) { this.fechaFin = fechaFin; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public Integer getIdOrganizacionBenefica() { return idOrganizacionBenefica; }
    public void setIdOrganizacionBenefica(Integer idOrganizacionBenefica) { this.idOrganizacionBenefica = idOrganizacionBenefica; }
}