package com.team5.upc.dovitproject.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Donaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDonaciones")
    private Integer id;

    @Column(name = "cantidadMonetaria")
    private Integer cantidadMonetaria;

    @Column(name = "fechaDonacion")
    @Temporal(TemporalType.DATE)
    private Date fechaDonacion;

    @Column(name = "metodoDePago")
    private String metodoDePago;

    //Relaciones
    @ManyToOne
    @JoinColumn(name = "idDonante")
    private Donante donante;

    @ManyToOne
    @JoinColumn(name = "idProyecto")
    private Proyecto proyecto;
}
