package com.team5.upc.dovitproject.controller;

import com.team5.upc.dovitproject.Model.Comentarios;
import com.team5.upc.dovitproject.dto.ComentarioDto;
import com.team5.upc.dovitproject.serviceinterfaces.ComentarioServiceInterface;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("Comentarios")
@PreAuthorize("hasAnyAuthority('Donante')")
public class ComentarioController {
    @Autowired
    private ComentarioServiceInterface cS;

    @PostMapping("/insertar")
    public void Insertar(@RequestBody ComentarioDto comentarioDto) {
        ModelMapper m = new ModelMapper();
        Comentarios c = m.map(comentarioDto, Comentarios.class);
        cS.Insert(c);
    }

    @PostMapping("/Actualizar")
    public void Actualizar(@RequestBody ComentarioDto comentarioDto) {
        ModelMapper m = new ModelMapper();
        Comentarios c = m.map(comentarioDto, Comentarios.class);
        cS.Update(c);
    }


    @DeleteMapping("/Delete{id}")
    public void delete(@PathVariable("id") Integer id) { cS.Delete(id); }


    @GetMapping("/Listar")
    @PreAuthorize("hasAnyAuthority('Donante')")
    public List<ComentarioDto> list() {
        return cS.list().stream().map( y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, ComentarioDto.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/ListarPorProyecto/{idProyecto}")
    @PreAuthorize("hasAnyAuthority('Donante')")
    public List<ComentarioDto> listarPorProyecto(@PathVariable("idProyecto") Integer idProyecto) {
        return cS.findAllByProyectoId(idProyecto).stream().map(comentario -> {
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(comentario, ComentarioDto.class);
        }).collect(Collectors.toList());
    }
}
