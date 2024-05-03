package com.team5.upc.dovitproject.repository;

import com.team5.upc.dovitproject.Model.Publicaciones_Foro;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Publicaciones_ForoRepository extends CrudRepository<Publicaciones_Foro,Integer> {

}
