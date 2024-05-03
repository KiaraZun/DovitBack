package com.team5.upc.dovitproject.dto;

import com.team5.upc.dovitproject.Model.Donante;
import com.team5.upc.dovitproject.Model.Proyecto;
import jakarta.persistence.*;

import java.util.Date;

public class DonacionDto {
    private Integer id;
    private Integer cantidadMonetaria;
    private Date fechaDonacion;
    private String metodoDePago;
    private Integer idDonante;
    private Integer idDroyecto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidadMonetaria() {
        return cantidadMonetaria;
    }

    public void setCantidadMonetaria(Integer cantidadMonetaria) {
        this.cantidadMonetaria = cantidadMonetaria;
    }

    public Date getFechaDonacion() {
        return fechaDonacion;
    }

    public void setFechaDonacion(Date fechaDonacion) {
        this.fechaDonacion = fechaDonacion;
    }

    public String getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public Integer getIdDonante() {
        return idDonante;
    }

    public void setIdDonante(Integer idDonante) {
        this.idDonante = idDonante;
    }

    public Integer getIdDroyecto() {
        return idDroyecto;
    }

    public void setIdDroyecto(Integer idDroyecto) {
        this.idDroyecto = idDroyecto;
    }
}
