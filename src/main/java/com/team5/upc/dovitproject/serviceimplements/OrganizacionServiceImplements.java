package com.team5.upc.dovitproject.serviceimplements;

import com.team5.upc.dovitproject.Model.Donante;
import com.team5.upc.dovitproject.Model.Organizacion;
import com.team5.upc.dovitproject.repository.OrganizacionRepository;
import com.team5.upc.dovitproject.serviceinterfaces.OrganizacionServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizacionServiceImplements implements OrganizacionServiceInterface {

    @Autowired
    private OrganizacionRepository oR;

    @Override
    public void Insertar(Organizacion organizacion) { oR.save(organizacion); }

    @Override
    public void Actualizar(Organizacion organizacion) { oR.save(organizacion); }

    @Override
    public List<Organizacion> lista() { return (List<Organizacion>) oR.findAll(); }

    @Override
    public List<Organizacion> ListarDepartamentoAndDistrito(String departamento, String distrito) {
        return oR.findByDepartamentoAndDistrito(departamento, distrito);
    }

    @Override
    public List<Organizacion> ListarCategory(String category) {
        return oR.findByProjectCategory(category);
    }
}
