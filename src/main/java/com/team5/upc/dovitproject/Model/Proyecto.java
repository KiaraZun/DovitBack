package com.team5.upc.dovitproject.Model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProyectos")
    private Integer id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "estado")
    private String estado;

    @Column(name="monto_recaudado")
    private Double monto_recaudado;

    @Column(name = "monto_objetivo")
    private Double monto_objetivo;

    @Column(name = "fechaInicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;

    @Column(name = "fechaFin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;

    @Column(name = "categoria")
    private String categoria;

    //Relaciones
    @ManyToOne
    @JoinColumn(name = "idOrganizacion")
    private Organizacion organizacion;

    @OneToMany(mappedBy = "proyecto")
    private List<Donaciones> donaciones;

    @OneToMany(mappedBy = "proyecto")
    private List<Comentarios> comentarios;

    @OneToMany (mappedBy = "proyecto", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Foros> foros;

    public void SetId(Integer id){ this.id=id;}
    public Integer getId() { return this.id;}

    public void SetTitulo (String titulo) { this.titulo=titulo;}
    public String GetTitulo() { return this.titulo;}

    public void SetDescripcion (String descripcion) { this.descripcion=descripcion;}
    public String GetDescripcion() { return this.descripcion;}

    public void SetEstado (String estado) { this.estado=estado;}
    public String GetEstado() { return this.estado;}

    public void SetMontoRecaudado (Double monto) { this.monto_recaudado=monto;}
    public Double GetMontoRecaudado() { return this.monto_recaudado;}

    public void SetMontoObjetivo (Double monto) { this.monto_objetivo=monto;}
    public Double GetMontoObjetivo() { return this.monto_objetivo;}

    public void SetFechaInicio(Date fecha) {this.fechaInicio=fecha;}
    public Date GetFechaInicio() {return this.fechaInicio;}

    public void SetFechaFin(Date fecha) {this.fechaFin=fecha;}
    public Date GetFechaFin() {return this.fechaFin;}

    public void SetCategoria (String categoria) { this.categoria=categoria;}
    public String GetCategoria() { return this.categoria;}

}
