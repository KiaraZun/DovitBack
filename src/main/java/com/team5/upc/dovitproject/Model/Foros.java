package com.team5.upc.dovitproject.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Foros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idForo")
    private Integer id;

    @Column(name = "titulo")
    private String titulo;

    @OneToMany(mappedBy = "foros")
    private List<Publicaciones_Foro> publicaciones_foro;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "proyecto_id")
    private Proyecto proyecto;

    public Foros() {
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

    public List<Publicaciones_Foro> getPublicaciones_foro() {
        return publicaciones_foro;
    }

    public void setPublicaciones_foro(List<Publicaciones_Foro> publicaciones_foro) {
        this.publicaciones_foro = publicaciones_foro;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
}