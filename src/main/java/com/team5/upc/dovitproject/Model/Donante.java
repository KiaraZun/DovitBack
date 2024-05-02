package com.team5.upc.dovitproject.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Donante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDonante")
    private int idDonante;

    @Column(name = "nombreCompleto")
    private String nombreCompleto;

    @Column(name = "contactoTelefonico")
    private String contactoTelefonico;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "distrito")
    private String distrito;

    @Column(name = "direccion")
    private String direccion;

    //Relaciones

    @OneToOne
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario") // El nombre debe coincidir con el de Usuario
    private Usuario usuario;

    @OneToMany(mappedBy = "donante")
    private List<Donaciones> donaciones;

    @OneToMany(mappedBy = "donante")
    private List<Comentarios> comentarios;

    @OneToMany(mappedBy = "donante")
    private List<Publicaciones_Foro> publicaciones_foro;

    public Donante() {
    }

    public Donante(int idDonante, String nombreCompleto, String contactoTelefonico, String departamento, String distrito, String direccion, Usuario usuario, List<Donaciones> donaciones, List<Comentarios> comentarios, List<Publicaciones_Foro> publicaciones_foro) {
        this.idDonante = idDonante;
        this.nombreCompleto = nombreCompleto;
        this.contactoTelefonico = contactoTelefonico;
        this.departamento = departamento;
        this.distrito = distrito;
        this.direccion = direccion;
        this.usuario = usuario;
        this.donaciones = donaciones;
        this.comentarios = comentarios;
        this.publicaciones_foro = publicaciones_foro;
    }

    public int getIdDonante() {
        return idDonante;
    }

    public void setIdDonante(int idDonante) {
        this.idDonante = idDonante;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getContactoTelefonico() {
        return contactoTelefonico;
    }

    public void setContactoTelefonico(String contactoTelefonico) {
        this.contactoTelefonico = contactoTelefonico;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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

    public List<Publicaciones_Foro> getPublicaciones_foro() {
        return publicaciones_foro;
    }

    public void setPublicaciones_foro(List<Publicaciones_Foro> publicaciones_foro) {
        this.publicaciones_foro = publicaciones_foro;
    }
}
