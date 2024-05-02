package com.team5.upc.dovitproject.Model;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.Data;

import java.util.List;

@Entity
@Data
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
}
