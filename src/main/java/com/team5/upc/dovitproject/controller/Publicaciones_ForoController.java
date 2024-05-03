package com.team5.upc.dovitproject.controller;

import com.team5.upc.dovitproject.Model.Publicaciones_Foro;
import com.team5.upc.dovitproject.dto.Publicaciones_ForoDto;
import com.team5.upc.dovitproject.serviceinterfaces.Publicaciones_ForoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Publicaciones_Foro")
@PreAuthorize("hasAnyAuthority('Donante','Organizacion')")
public class Publicaciones_ForoController {
    @Autowired
    private Publicaciones_ForoService pfs;

    @PostMapping("/Insert")
    public void AgregarPublicaciones_Foro(@RequestBody Publicaciones_ForoDto dto) {
        ModelMapper m = new ModelMapper();
        Publicaciones_Foro pf = m.map(dto, Publicaciones_Foro.class);
        pfs.Insert(pf);
    }
    @DeleteMapping("/delete/{id}")
    public void Eliminar(@PathVariable("id") int id) {
        pfs.delete(id);
    }

    @PutMapping("/update")
    public  void Modificar(@RequestBody Publicaciones_ForoDto dto) {
        ModelMapper m = new ModelMapper();
        Publicaciones_Foro pf = m.map(dto, Publicaciones_Foro.class);
        pfs.Insert(pf);
    }

    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('Donante','Organizacion')")
    public List<Publicaciones_ForoDto> list() {
        return pfs.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, Publicaciones_ForoDto.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/listarId/{id}")
    @PreAuthorize("hasAnyAuthority('Donante','Organizacion')")
    public Publicaciones_ForoDto listarPorId(@PathVariable ("id") int id) {
        ModelMapper m = new ModelMapper();
        Publicaciones_ForoDto pfDto = m.map(pfs.listarId(id), Publicaciones_ForoDto.class);
        return pfDto;
    }
}