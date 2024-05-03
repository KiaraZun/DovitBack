package com.team5.upc.dovitproject.serviceinterfaces;

import com.team5.upc.dovitproject.Model.Publicaciones_Foro;

import java.util.List;

public interface Publicaciones_ForoService {
    public void Insert(Publicaciones_Foro publicaciones_foro);
    public List<Publicaciones_Foro> list();
    public void delete(int idPublicaciones_Foro);
    public Publicaciones_Foro listarId(int idPublicaciones_Foro);
}
