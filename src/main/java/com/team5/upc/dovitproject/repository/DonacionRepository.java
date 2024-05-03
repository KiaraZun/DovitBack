package com.team5.upc.dovitproject.repository;

import com.team5.upc.dovitproject.Model.Donaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DonacionRepository extends JpaRepository<Donaciones, Integer> {

    @Query(value = "select don.* from donaciones as don \n" +
            "join donante as dan on don.id_donaciones = dan.id_donante \n" +
            "where dan.id_donante = :idDonante", nativeQuery = true)
    public List<String[]> prueba(@Param("idDonante") Integer idDonante);





    @Query(value="SELECT * \n" +
            "FROM donaciones\n" +
            "WHERE EXTRACT(YEAR FROM fecha_donacion) = EXTRACT(YEAR FROM CURRENT_DATE) AND donaciones.id_donante = :idDonante", nativeQuery = true)
    List<Donaciones> donaciones(@Param("idDonante") Integer idDonante);

}
