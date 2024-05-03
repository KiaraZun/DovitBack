package com.team5.upc.dovitproject.serviceinterfaces;

import com.team5.upc.dovitproject.Model.Donaciones;
import com.team5.upc.dovitproject.dto.DonacionDto;
import java.util.*;

public interface DonacionServiceInterface {
    void InsertarDonacion(Donaciones donacion);
    public List<DonacionDto> ListarDonacionesPorIdDonante(int idDonante);
    public List<DonacionDto> ListarDonacionesPorIdProyecto(int idProyecto);
    public List<DonacionDto> ListarDonaciones();
    public List<String[]> prueba(Integer idDonante);
    public List<Donaciones> donaciones(Integer idDonante);
}