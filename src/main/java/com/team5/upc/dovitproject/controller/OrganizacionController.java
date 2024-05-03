package com.team5.upc.dovitproject.controller;

import com.team5.upc.dovitproject.Model.Organizacion;
import com.team5.upc.dovitproject.dto.OrganizacionDto;
import com.team5.upc.dovitproject.serviceinterfaces.OrganizacionServiceInterface;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("Organizaciones")
@PreAuthorize("hasAnyAuthority('Organizacion')")
public class OrganizacionController {
    @Autowired
    private OrganizacionServiceInterface oS;

    @PostMapping("/insertar")
    public void registrar(@RequestBody OrganizacionDto dto) {
        ModelMapper c = new ModelMapper();
        Organizacion o = c.map(dto, Organizacion.class);
        oS.Insertar(o);
    }

    @PutMapping("/actualizar")
    public void actualizar(@RequestBody OrganizacionDto dto) {
        ModelMapper modelMapper = new ModelMapper();
        Organizacion o = modelMapper.map(dto, Organizacion.class);
        oS.Actualizar(o);
    }

    @GetMapping("/Lista")
    @PreAuthorize("hasAnyAuthority('Organizacion')")
    public List<OrganizacionDto> list() {
        return oS.lista().stream().map(y -> {
            ModelMapper c = new ModelMapper();
            return c.map(y, OrganizacionDto.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/Buscar/{departamento}/{distrito}")
    @PreAuthorize("hasAnyAuthority('Organizacion')")
    public List<Organizacion> listarPorDepartamentoYDistrito(@PathVariable String departamento, @PathVariable String distrito) {
        return oS.ListarDepartamentoAndDistrito(departamento, distrito);
    }

    @GetMapping("/BUscar/{categoria}")
    @PreAuthorize("hasAnyAuthority('Organizacion')")
    public List<Organizacion> listarPorCategoria(@PathVariable String categoria) {
        return oS.ListarCategory(categoria);
    }
}