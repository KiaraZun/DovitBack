package com.team5.upc.dovitproject.serviceinterfaces;

import com.team5.upc.dovitproject.Model.Comentarios;

import java.util.List;

public interface ComentarioServiceInterface {
    public void Insert(Comentarios comentarios);
    public List<Comentarios> list();
    public void Update(Comentarios comentarios);
    public void Delete(int idComentario);
    List<Comentarios> findAllByProyectoId(int idProyecto);
}