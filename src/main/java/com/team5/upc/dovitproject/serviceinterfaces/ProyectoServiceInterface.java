package com.team5.upc.dovitproject.serviceinterfaces;

import com.team5.upc.dovitproject.Model.Proyecto;
import com.team5.upc.dovitproject.dto.ProyectoDto;
import java.util.*;


public interface ProyectoServiceInterface {
    void InsertarProyecto(Proyecto proyecto);
    public List<ProyectoDto> ListarLosProyectos();
    public ProyectoDto ListarUnProyecto (String nombre);
}
