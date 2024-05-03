package com.team5.upc.dovitproject.dto;

import java.util.List;

public class ComentariosPorProyecto {
    private int idProyecto;
    private List<ComentarioDto> comentarios;

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public List<ComentarioDto> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<ComentarioDto> comentarios) {
        this.comentarios = comentarios;
    }
}
