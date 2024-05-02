package com.team5.upc.dovitproject.dto;

import java.util.List;

public class ComentariosPorProyecto {

    private Integer idProyecto;
    private List<ComentarioDto> comentarios;

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public List<ComentarioDto> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<ComentarioDto> comentarios) {
        this.comentarios = comentarios;
    }
}
