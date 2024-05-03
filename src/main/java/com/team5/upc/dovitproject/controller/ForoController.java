package com.team5.upc.dovitproject.controller;

import com.team5.upc.dovitproject.Model.Foros;
import com.team5.upc.dovitproject.dto.ForoDto;
import com.team5.upc.dovitproject.serviceimplements.ForoServiceImplements;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foro")
@PreAuthorize("hasAnyAuthority('Donante','Organizacion')")
public class ForoController {
    private final ForoServiceImplements foroServiceImplements;

    @Autowired
    public ForoController(ForoServiceImplements foroServiceImplements) {
        this.foroServiceImplements = foroServiceImplements;
    }

    @PostMapping("/NuevoForo")
    public void NuevoForo(@RequestBody ForoDto foroDto) {
        ModelMapper c = new ModelMapper();
        Foros o = c.map(foroDto, Foros.class);
        foroServiceImplements.insertarForo(o);
    }

    @GetMapping("/ListarForosPorNombreProyecto")
    @PreAuthorize("hasAnyAuthority('Donante','Organizacion')")
    public ResponseEntity<List<ForoDto>> ListarForosPorNombreProyecto(@RequestBody String nombreProyecto) {
        List<ForoDto> listaFinal = foroServiceImplements.ListarForosPorNombreProyecto(nombreProyecto);
        return ResponseEntity.ok(listaFinal);
    }
}
