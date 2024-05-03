package com.team5.upc.dovitproject.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.team5.upc.dovitproject.serviceinterfaces.ProyectoServiceInterface;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.team5.upc.dovitproject.Model.Proyecto;
import com.team5.upc.dovitproject.dto.ProyectoDto;

@RestController
@RequestMapping("/Proyecto")
@PreAuthorize("hasAnyAuthority('Organizacion')")
public class ProyectoController {
    @Autowired
    private ProyectoServiceInterface pS;

    @PostMapping("/insertar")
    public void registrar(@RequestBody ProyectoDto dto) {
        ModelMapper c = new ModelMapper();
        Proyecto p = c.map(dto, Proyecto.class);
        pS.Insertar(p);
    }

    @GetMapping("/Listado")
    @PreAuthorize("hasAnyAuthority('Organizacion')")
    public List<ProyectoDto> list() {
        return pS.lista().stream().map(y -> {
            ModelMapper c = new ModelMapper();
            return c.map(y, ProyectoDto.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/Buscar/{departamento}/{distrito}")
    @PreAuthorize("hasAnyAuthority('Organizacion')")
    public List<Proyecto> listarxNombre(@PathVariable String titulo) {
        return pS.ListarxNombre(titulo);
    }
}