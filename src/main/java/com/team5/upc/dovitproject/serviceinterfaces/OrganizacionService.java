package com.team5.upc.dovitproject.serviceinterfaces;

import com.team5.upc.dovitproject.Model.Organizacion;

import java.util.List;

public interface OrganizacionService {
    public void Insertar(Organizacion organizacion);
    public void Actualizar(Organizacion organizacion);
    List<Organizacion> findAllOrganizaciones();
    List<Organizacion> findByDepartamentoAndDistrito(String departamento, String distrito);
    List<Organizacion> findByProjectCategory(String category);
}
