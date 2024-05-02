package com.team5.upc.dovitproject.controller;


import com.team5.upc.dovitproject.Model.Donaciones;
import com.team5.upc.dovitproject.dto.DonacionDto;
import com.team5.upc.dovitproject.serviceimplements.DonacionServiceImplements;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Donaciones")
public class DonacionController {
    private final DonacionServiceImplements donacionServiceImplements;

    @Autowired
    public DonacionController(DonacionServiceImplements donacionServiceImplements) {
        this.donacionServiceImplements = donacionServiceImplements;
    }

    @PostMapping("/NuevaDonacion")
    public void registrar(@RequestBody DonacionDto donacionDto) {
        ModelMapper c = new ModelMapper();
        Donaciones o = c.map(donacionDto, Donaciones.class);
        donacionServiceImplements.InsertarDonacion(o);
    }

    @GetMapping("/ListarDonacionesPorIdDonante")
    public ResponseEntity<List<DonacionDto>> ListarDonacionesPorIdDonante(@RequestBody Integer idDonante) {
       List<DonacionDto> listaFinal = donacionServiceImplements.ListarDonacionesPorIdDonante(idDonante);
         return ResponseEntity.ok(listaFinal);
    }

    @GetMapping("/ListarDonacionesPorIdProyecto")
    public ResponseEntity<List<DonacionDto>> ListarDonacionesPorIdProyecto(@RequestBody Integer idProyecto) {
        List<DonacionDto> listaFinal = donacionServiceImplements.ListarDonacionesPorIdProyecto(idProyecto);
        return ResponseEntity.ok(listaFinal);
    }

}
