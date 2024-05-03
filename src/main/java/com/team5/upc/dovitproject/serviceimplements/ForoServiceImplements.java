package com.team5.upc.dovitproject.serviceimplements;

import com.team5.upc.dovitproject.Model.Foros;
import com.team5.upc.dovitproject.dto.ForoDto;
import com.team5.upc.dovitproject.repository.ForoRepository;
import com.team5.upc.dovitproject.serviceinterfaces.ForoServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ForoServiceImplements implements ForoServiceInterface{
    @Autowired
    private ForoRepository foroRepository;


    @Override
    public void insertarForo(Foros foro) {
        foroRepository.save(foro);
    }

    @Override
    public List<ForoDto> ListarForosPorNombreProyecto(String nombreProyecto) {
        List<ForoDto> ListaFinalDeForos = ListarForos();
        List<ForoDto> forosPorNombreProyecto = new ArrayList<>();

        for (ForoDto f : ListaFinalDeForos) {
            if (f.getTitulo().equals(nombreProyecto)) {
                forosPorNombreProyecto.add(f);
            }
        }
        return forosPorNombreProyecto;
    }

    @Override
    public List<ForoDto> ListarForos() {
        List<ForoDto> ListaFinalDeForos = new ArrayList<>();
        List<Foros> foros = foroRepository.findAll();
        ForoDto foro;

        for (Foros f : foros) {
            foro = new ForoDto();

            foro.setId(f.getId());
            foro.setTitulo(f.getTitulo());
            foro.setIdProyecto(f.getProyecto().getId());

            ListaFinalDeForos.add(foro);
        }
        return ListaFinalDeForos;
    }
}
