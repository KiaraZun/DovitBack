package com.team5.upc.dovitproject.serviceinterfaces;

import com.team5.upc.dovitproject.Model.Foros;
import com.team5.upc.dovitproject.dto.ForoDto;

import java.util.List;

public interface ForoServiceInterface {
    void insertarForo(Foros foro);
    public List<ForoDto> ListarForosPorNombreProyecto(String nombreProyecto);
    public List<ForoDto> ListarForos();
}
