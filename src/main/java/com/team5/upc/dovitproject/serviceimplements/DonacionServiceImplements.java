package com.team5.upc.dovitproject.serviceimplements;


import com.team5.upc.dovitproject.Model.Donaciones;
import com.team5.upc.dovitproject.dto.DonacionDto;
import com.team5.upc.dovitproject.repository.DonacionRepository;
import com.team5.upc.dovitproject.serviceinterfaces.DonacionServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DonacionServiceImplements implements DonacionServiceInterface {
    @Autowired
    private DonacionRepository donacionRepository;

    public DonacionServiceImplements(DonacionRepository donacionRepository) {
        this.donacionRepository = donacionRepository;
    }

    @Override
    public void InsertarDonacion(Donaciones donacion) {
        donacionRepository.save(donacion);
    }

    @Override
    public List<DonacionDto> ListarDonacionesPorIdDonante(int idDonante) {
        List<DonacionDto> ListaFinalDeDonaciones = ListarDonaciones();
        List<DonacionDto> donacionPorIdDonante = new ArrayList<>();

        for (DonacionDto d : ListaFinalDeDonaciones) {
            if (d.getIdDonante() == idDonante) {
                donacionPorIdDonante.add(d);
            }
        }
        return donacionPorIdDonante;
    }

    @Override
    public List<DonacionDto> ListarDonacionesPorIdProyecto(int idProyecto) {
        List<DonacionDto> ListaFinalDeDonaciones = ListarDonaciones();
        List<DonacionDto> donacionPorIdProyecto = new ArrayList<>();

        for (DonacionDto d : ListaFinalDeDonaciones) {
            if (d.getIdDroyecto() == idProyecto) {
                donacionPorIdProyecto.add(d);
            }
        }
        return donacionPorIdProyecto;
    }

    @Override
    public List<DonacionDto> ListarDonaciones() {
        List<DonacionDto> ListaFinalDeDonaciones = new ArrayList<>();
        List<Donaciones> donaciones = donacionRepository.findAll();
        DonacionDto donacion;
        for (Donaciones d : donaciones) {
            donacion = new DonacionDto();
            donacion.setId(d.getId());
            donacion.setCantidadMonetaria(d.getCantidadMonetaria());
            donacion.setFechaDonacion(d.getFechaDonacion());
            donacion.setMetodoDePago(d.getMetodoDePago());
            donacion.setIdDonante(d.getDonante().getIdDonante());
            donacion.setIdDroyecto(d.getProyecto().getId());
            ListaFinalDeDonaciones.add(donacion);
        }
        return ListaFinalDeDonaciones;
    }

    @Override
    public List<String[]> prueba(Integer idDonante) {
        return donacionRepository.prueba(idDonante);
    }

    @Override
    public List<Donaciones> donaciones(Integer idDonante) {
        return donacionRepository.donaciones(idDonante);
    }


}