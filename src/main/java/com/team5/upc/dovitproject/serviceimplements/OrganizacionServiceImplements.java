package com.team5.upc.dovitproject.serviceimplements;

import com.team5.upc.dovitproject.Model.Organizacion;
import com.team5.upc.dovitproject.repository.OrganizacionRepository;
import com.team5.upc.dovitproject.serviceinterfaces.OrganizacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizacionServiceImplements implements OrganizacionService {

    @Autowired
    private OrganizacionRepository oR;


    @Override
    public void Insertar(Organizacion organizacion) {}

    @Override
    public void Actualizar(Organizacion organizacion) {}

    @Override
    public List<Organizacion> findAllOrganizaciones() {
        return (List<Organizacion>) oR.findAll();
    }

    @Override
    public List<Organizacion> findByDepartamentoAndDistrito(String departamento, String distrito) {
        return oR.findByDepartamentoAndDistrito(departamento, distrito);
    }

    @Override
    public List<Organizacion> findByProjectCategory(String category) {
        return oR.findByProjectCategory(category);
    }
}
