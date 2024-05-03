package com.team5.upc.dovitproject.serviceinterfaces;

import com.team5.upc.dovitproject.Model.Donante;
import com.team5.upc.dovitproject.Model.Proyecto;
import com.team5.upc.dovitproject.dto.ProyectoDto;
import org.springframework.security.access.method.P;

import java.util.*;


public interface ProyectoServiceInterface {
    void Insertar(Proyecto proyecto);
    public List<Proyecto> lista();
    public List<Proyecto> ListarxNombre(String titulo);
}