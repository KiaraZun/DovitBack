package com.team5.upc.dovitproject.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team5.upc.dovitproject.Model.Proyecto;
import com.team5.upc.dovitproject.dto.ProyectoDto;
import com.team5.upc.dovitproject.serviceimplements.ProyectoServiceImplements;

@RestController
@RequestMapping("/Proyecto")
public class ProyectoController {
    private final ProyectoServiceImplements proyectoServiceImplements;

    @Autowired
    public ProyectoController(ProyectoServiceImplements proyectoServiceImplements){
        this.proyectoServiceImplements=proyectoServiceImplements;
    }

    @PostMapping("/NuevoProyecto")
    public void registrar(@RequestBody ProyectoDto proyectoDto){
        ModelMapper c = new ModelMapper();
        Proyecto o = c.map(proyectoDto, Proyecto.class);
        proyectoServiceImplements.InsertarProyecto(o);
    }

    @GetMapping("/ListarProyectos")
    public ResponseEntity<List<ProyectoDto>> ListarLosProyectos(){
        List<ProyectoDto> listaFinal = proyectoServiceImplements.ListarLosProyectos();
        return ResponseEntity.ok(listaFinal);
    }

    @GetMapping("/ListarProyectoNombre")
    public ResponseEntity<ProyectoDto> ListarProyectoNombre(@RequestBody String nombre){
        ProyectoDto proyectoDto=proyectoServiceImplements.ListarUnProyecto(nombre);
        return ResponseEntity.ok(proyectoDto);
    }


}
