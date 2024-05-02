package com.team5.upc.dovitproject.dto;

import java.util.Date;

public class ProyectoDto {
    private Integer id;
    private String titulo;
    private String descripcion;
    private String estado;
    private double montoRecaudado;
    private double montoObjetivo;
    private Date fechaInicio;
    private Date fechaFin;
    private String categoria;
    private Integer idOrganizacionBenefica;

    public void SetId(Integer id){ this.id=id;}
    public Integer getId() { return this.id;}

    public void SetTitulo (String titulo) { this.titulo=titulo;}
    public String GetTitulo() { return this.titulo;}

    public void SetDescripcion (String descripcion) { this.descripcion=descripcion;}
    public String GetDescripcion() { return this.descripcion;}

    public void SetEstado (String estado) { this.estado=estado;}
    public String GetEstado() { return this.estado;}

    public void SetMontoRecaudado (Double monto) { this.montoRecaudado=monto;}
    public Double GetMontoRecaudado() { return this.montoRecaudado;}

    public void SetMontoObjetivo (Double monto) { this.montoObjetivo=monto;}
    public Double GetMontoObjetivo() { return this.montoObjetivo;}

    public void SetFechaInicio(Date fecha) {this.fechaInicio=fecha;}
    public Date GetFechaInicio() {return this.fechaInicio;}

    public void SetFechaFin(Date fecha) {this.fechaFin=fecha;}
    public Date GetFechaFin() {return this.fechaFin;}

    public void SetCategoria (String categoria) { this.categoria=categoria;}
    public String GetCategoria() { return this.categoria;}

    public Integer getIdOrganizacionBenefica() { return this.idOrganizacionBenefica;}
}
