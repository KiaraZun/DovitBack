package com.team5.upc.dovitproject.controller;

import com.team5.upc.dovitproject.Model.Donaciones;
import com.team5.upc.dovitproject.dto.DonacionDto;
import com.team5.upc.dovitproject.serviceimplements.DonacionServiceImplements;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Donaciones")
@PreAuthorize("hasAnyAuthority('Donante')")
public class DonacionController {
    @Autowired
    private final DonacionServiceImplements donacionServiceImplements;

    @Autowired
    public DonacionController(DonacionServiceImplements donacionServiceImplements) {
        this.donacionServiceImplements = donacionServiceImplements;
    }

    @PostMapping("/NuevaDonacion")
    @PreAuthorize("hasAuthority('Donante')")
    public void registrar(@RequestBody DonacionDto donacionDto) {
        ModelMapper c = new ModelMapper();
        Donaciones o = c.map(donacionDto, Donaciones.class);
        donacionServiceImplements.InsertarDonacion(o);
    }


    @GetMapping("/ListarDonacionesPorIdDonante/{idDonante}")
    @PreAuthorize("hasAuthority('Donante')")
    public ResponseEntity<List<DonacionDto>> ListarDonacionesPorIdDonante(@PathVariable("idDonante") Integer idDonante) {
        List<DonacionDto> listaFinal = donacionServiceImplements.ListarDonacionesPorIdDonante(idDonante);
        return ResponseEntity.ok(listaFinal);
    }

    @GetMapping("/ListarDonacionesPorIdProyecto/{idProyectos}")
    @PreAuthorize("hasAuthority('Donante')")
    public ResponseEntity<List<DonacionDto>> ListarDonacionesPorIdProyecto(@PathVariable("idProyectos") Integer idProyectos) {
        List<DonacionDto> listaFinal = donacionServiceImplements.ListarDonacionesPorIdProyecto(idProyectos);
        return ResponseEntity.ok(listaFinal);
    }

    @GetMapping("/ListarDonacionesPorIdProyectoEnEsteAnio/{idDonante}")
    @PreAuthorize("hasAuthority('Donante')")
    public List<Donaciones> donaciones(@PathVariable("idDonante") Integer idDonante){
        List<Donaciones> listaFinal = donacionServiceImplements.donaciones(idDonante);
        return ResponseEntity.ok(listaFinal).getBody();
    }
}