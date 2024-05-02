package com.team5.upc.dovitproject.serviceinterfaces;

import com.team5.upc.dovitproject.Model.Donaciones;
import com.team5.upc.dovitproject.dto.DonacionDto;
import java.util.*;

public interface DonacionServiceInterface {
    /*
    * donaciones LUIS:
- listar donaciones segun el id de un donante
- insertar donacion
- listar todas las donaciones de un proyecto
- QUERIE: listar las donaciones de un donante en el ultimo año.

    * */
    void InsertarDonacion(Donaciones donacion);
    public List<DonacionDto> ListarDonacionesPorIdDonante(int idDonante);
    public List<DonacionDto> ListarDonacionesPorIdProyecto(int idProyecto);
    public List<DonacionDto> ListarDonaciones();
}
