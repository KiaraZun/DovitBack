package com.team5.upc.dovitproject.dto;

import java.util.Set;

public class OrganizacionDto {
    private int idOrganizacion;
    private String nombreOrganizacion;
    private String departamento;
    private String distrito;
    private String direccion;
    private int cantidadProyectos;
    private String nombreContacto;
    private String numeroTelefonicoRepresentante;
    private String correoElectronicoRepresentante;

    private Set<String> categories;

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

    public Set<String> getCategories() {
        return categories;
    }

    public void setCategories(Set<String> categories) {
        this.categories = categories;
    }
}