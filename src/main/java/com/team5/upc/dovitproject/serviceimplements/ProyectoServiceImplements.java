package com.team5.upc.dovitproject.serviceimplements;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team5.upc.dovitproject.Model.Proyecto;
import com.team5.upc.dovitproject.dto.ProyectoDto;
import com.team5.upc.dovitproject.repository.ProyectoRepository;
import com.team5.upc.dovitproject.serviceinterfaces.ProyectoServiceInterface;

@Service
public class ProyectoServiceImplements implements ProyectoServiceInterface{
    
    @Autowired
    ProyectoRepository proyectoRepository;

    public ProyectoServiceImplements(ProyectoRepository proyectoRepository){
        this.proyectoRepository=proyectoRepository;
    }

    @Override
    public void InsertarProyecto(Proyecto proyecto) {
        proyectoRepository.save(proyecto);
    }

    @Override
    public List<ProyectoDto> ListarLosProyectos() {
        List<ProyectoDto> ListaFinalDeProyectos = new ArrayList<>();
        List<Proyecto> proyectos = proyectoRepository.findAll();
        ProyectoDto proyecto;
        for(Proyecto p: proyectos){
            proyecto = new ProyectoDto();
            proyecto.SetId(p.getId());
            proyecto.SetTitulo(p.GetTitulo());
            proyecto.SetDescripcion(p.GetDescripcion());
            proyecto.SetEstado(p.GetEstado());
            proyecto.SetMontoRecaudado(p.GetMontoRecaudado());
            proyecto.SetMontoObjetivo(p.GetMontoObjetivo());
            proyecto.SetFechaInicio(p.GetFechaInicio());
            proyecto.SetFechaFin(p.GetFechaFin());
            proyecto.SetCategoria(p.GetCategoria());
            ListaFinalDeProyectos.add(proyecto);
            proyecto = null;
        }
        return ListaFinalDeProyectos;
    }

    @Override
    public ProyectoDto ListarUnProyecto(String nombre) {
        List<ProyectoDto> ListaFinalDeProyectos = ListarLosProyectos();
        ProyectoDto proyecto;
        for(ProyectoDto p: ListaFinalDeProyectos){
            if(p.GetTitulo()==nombre){
                proyecto = p;
                return proyecto;
            }else return null;
        }
        return null;
    }
    
}
