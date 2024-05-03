package com.team5.upc.dovitproject.serviceimplements;

import com.team5.upc.dovitproject.Model.Comentarios;
import com.team5.upc.dovitproject.repository.ComentarioRepository;
import com.team5.upc.dovitproject.serviceinterfaces.ComentarioServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentarioserviceImplements implements ComentarioServiceInterface {
    @Autowired
    private ComentarioRepository cR;

    @Override
    public  void Insert(Comentarios comentarios) {
        cR.save(comentarios);
    }

    @Override
    public List<Comentarios> list() {
        return (List<Comentarios>) cR.findAll();
    }

    @Override
    public void Update(Comentarios comentarios) {
        cR.save(comentarios);
    }

    @Override
    public void Delete(int idComentario) {
        cR.deleteById(idComentario);
    }

    @Override
    public List<Comentarios> findAllByProyectoId (int idProyecto) {
        return cR.findAllByProyectoId(idProyecto);
    }
}
