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

    @Column(name = "monto_objetivo")
    private Integer monto_objetivo;

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

    public Proyecto() {
    }

    public Proyecto(Integer id, String titulo, String descripcion, String estado, Integer monto_objetivo, Date fechaInicio, Date fechaFin, String categoria, Organizacion organizacion, List<Donaciones> donaciones, List<Comentarios> comentarios, List<Foros> foros) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.monto_objetivo = monto_objetivo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.categoria = categoria;
        this.organizacion = organizacion;
        this.donaciones = donaciones;
        this.comentarios = comentarios;
        this.foros = foros;
    }

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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getMonto_objetivo() {
        return monto_objetivo;
    }

    public void setMonto_objetivo(int monto_objetivo) {
        this.monto_objetivo = monto_objetivo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Organizacion getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(Organizacion organizacion) {
        this.organizacion = organizacion;
    }

    public List<Donaciones> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(List<Donaciones> donaciones) {
        this.donaciones = donaciones;
    }

    public List<Comentarios> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentarios> comentarios) {
        this.comentarios = comentarios;
    }

    public List<Foros> getForos() {
        return foros;
    }

    public void setForos(List<Foros> foros) {
        this.foros = foros;
    }
}