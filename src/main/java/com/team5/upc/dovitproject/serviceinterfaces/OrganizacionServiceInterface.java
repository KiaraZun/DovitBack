package com.team5.upc.dovitproject.serviceinterfaces;

import com.team5.upc.dovitproject.Model.Organizacion;

import java.util.List;

public interface OrganizacionServiceInterface {
    public void Insertar(Organizacion organizacion);
    public void Actualizar(Organizacion organizacion);
    public List<Organizacion> lista();
    public List<Organizacion> ListarDepartamentoAndDistrito (String departamento, String distrito);
    public List<Organizacion> ListarCategory(String category);
}