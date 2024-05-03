package com.team5.upc.dovitproject.serviceimplements;

import com.team5.upc.dovitproject.Model.Publicaciones_Foro;
import com.team5.upc.dovitproject.repository.Publicaciones_ForoRepository;
import com.team5.upc.dovitproject.serviceinterfaces.Publicaciones_ForoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Publicaciones_ForoServiceImplements implements Publicaciones_ForoService {

    @Autowired
    private Publicaciones_ForoRepository pfR;

    @Override
    public void Insert(Publicaciones_Foro publicaciones_foro) {
       pfR.save(publicaciones_foro);
    }

    @Override
    public List<Publicaciones_Foro> list() {
        return (List<Publicaciones_Foro>) pfR.findAll();
    }

    @Override
    public void delete(int idPublicaciones_Foro) {
        pfR.deleteById(idPublicaciones_Foro);
    }
    @Override
    public Publicaciones_Foro listarId(int idPublicaciones_Foro) {
        return  pfR.findById(idPublicaciones_Foro).orElse(new Publicaciones_Foro());
    }
}
