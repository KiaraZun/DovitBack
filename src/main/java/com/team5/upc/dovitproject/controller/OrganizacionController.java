package com.team5.upc.dovitproject.controller;

import com.team5.upc.dovitproject.Model.Donante;
import com.team5.upc.dovitproject.Model.Organizacion;
import com.team5.upc.dovitproject.dto.DonanteDto;
import com.team5.upc.dovitproject.dto.OrganizacionDto;
import com.team5.upc.dovitproject.serviceimplements.OrganizacionServiceImplements;
import com.team5.upc.dovitproject.serviceinterfaces.DonanteServiceInterface;
import com.team5.upc.dovitproject.serviceinterfaces.OrganizacionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Organizaciones")
@PreAuthorize("hasAnyAuthority('Organizacion')")
public class OrganizacionController {

    @Autowired
    private OrganizacionService oS;

    @PostMapping("/insertar")
    public void registrar(@RequestBody OrganizacionDto dto) {
        ModelMapper c = new ModelMapper();
        Organizacion o = c.map(dto, Organizacion.class);
        oS.Insertar(o);
    }

    @PutMapping("/actualizar")
    public void modificar(@RequestBody OrganizacionDto dto) {
        ModelMapper c = new ModelMapper();
        Organizacion o = c.map(dto, Organizacion.class);
        oS.Actualizar(o);
    }

    @GetMapping("/ListarTodo")
    @PreAuthorize("hasAnyAuthority('Organizacion')")
    public ResponseEntity<List<Organizacion>> ListaOrganizaciones() {
        List<Organizacion> organizaciones = oS.findAllOrganizaciones();
        return ResponseEntity.ok(organizaciones);
    }

    @GetMapping("/ListarPorUbicacion")
    @PreAuthorize("hasAnyAuthority('Organizacion')")
    public ResponseEntity<List<Organizacion>> listaOrganizacionesByLocation(
            @RequestParam String departamento,
            @RequestParam String distrito) {
        List<Organizacion> organizaciones = oS.findByDepartamentoAndDistrito(departamento, distrito);
        return ResponseEntity.ok(organizaciones);
    }

    @GetMapping("/ListarPorCategoria")
    @PreAuthorize("hasAnyAuthority('Organizacion')")
    public ResponseEntity<List<Organizacion>> listaOrganizacionesByCategory(
            @RequestParam String category) {
        List<Organizacion> organizaciones = oS.findByProjectCategory(category);
        return ResponseEntity.ok(organizaciones);
    }
}
