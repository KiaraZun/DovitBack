package com.team5.upc.dovitproject.serviceimplements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team5.upc.dovitproject.Model.Proyecto;
import com.team5.upc.dovitproject.repository.ProyectoRepository;
import com.team5.upc.dovitproject.serviceinterfaces.ProyectoServiceInterface;

@Service
public class ProyectoServiceImplements implements ProyectoServiceInterface{

    @Autowired
    private ProyectoRepository pR;

    @Override
    public void Insertar(Proyecto proyecto) {
        pR.save(proyecto);
    }

    @Override
    public List<Proyecto> lista() { return (List<Proyecto>) pR.findAll();
    }

    @Override
    public List<Proyecto> ListarxNombre (String titulo) {
        return pR.findByNombre(titulo);
    }
}