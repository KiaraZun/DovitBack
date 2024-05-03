package com.team5.upc.dovitproject.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Organizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOrganizacion")
    private int idOrganizacion;

    @Column(name = "nombreOrganizacion")
    private String nombreOrganizacion;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "distrito")
    private String distrito;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "cantidadProyectos")
    private int cantidadProyectos;

    @Column(name = "nombreContacto")
    private String nombreContacto;

    @Column(name = "numeroTelefonicoRepresentante")
    private String numeroTelefonicoRepresentante;

    @Column(name = "correoElectronicoRepresentante")
    private String correoElectronicoRepresentante;

    //Relaciones
    @OneToOne
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario") // El nombre debe coincidir con el de Usuario
    private Usuario usuario;

    @OneToMany(mappedBy = "organizacion")
    private List<Proyecto> proyectos;

    @OneToMany(mappedBy = "organizacion")
    private List<Publicaciones_Foro> publicaciones_foro;

    public Organizacion() {
    }

    public Organizacion(int idOrganizacion, String nombreOrganizacion, String departamento, String distrito, String direccion, int cantidadProyectos, String nombreContacto, String numeroTelefonicoRepresentante, String correoElectronicoRepresentante, Usuario usuario, List<Proyecto> proyectos, List<Publicaciones_Foro> publicaciones_foro) {
        this.idOrganizacion = idOrganizacion;
        this.nombreOrganizacion = nombreOrganizacion;
        this.departamento = departamento;
        this.distrito = distrito;
        this.direccion = direccion;
        this.cantidadProyectos = cantidadProyectos;
        this.nombreContacto = nombreContacto;
        this.numeroTelefonicoRepresentante = numeroTelefonicoRepresentante;
        this.correoElectronicoRepresentante = correoElectronicoRepresentante;
        this.usuario = usuario;
        this.proyectos = proyectos;
        this.publicaciones_foro = publicaciones_foro;
    }

    public int getIdOrganizacion() {
        return idOrganizacion;
    }

    public void setIdOrganizacion(int idOrganizacion) {
        this.idOrganizacion = idOrganizacion;
    }

    public String getNombreOrganizacion() {
        return nombreOrganizacion;
    }

    public void setNombreOrganizacion(String nombreOrganizacion) {
        this.nombreOrganizacion = nombreOrganizacion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidadProyectos() {
        return cantidadProyectos;
    }

    public void setCantidadProyectos(int cantidadProyectos) {
        this.cantidadProyectos = cantidadProyectos;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getNumeroTelefonicoRepresentante() {
        return numeroTelefonicoRepresentante;
    }

    public void setNumeroTelefonicoRepresentante(String numeroTelefonicoRepresentante) {
        this.numeroTelefonicoRepresentante = numeroTelefonicoRepresentante;
    }

    public String getCorreoElectronicoRepresentante() {
        return correoElectronicoRepresentante;
    }

    public void setCorreoElectronicoRepresentante(String correoElectronicoRepresentante) {
        this.correoElectronicoRepresentante = correoElectronicoRepresentante;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public List<Publicaciones_Foro> getPublicaciones_foro() {
        return publicaciones_foro;
    }

    public void setPublicaciones_foro(List<Publicaciones_Foro> publicaciones_foro) {
        this.publicaciones_foro = publicaciones_foro;
    }
}