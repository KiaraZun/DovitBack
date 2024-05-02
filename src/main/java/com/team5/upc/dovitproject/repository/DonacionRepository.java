package com.team5.upc.dovitproject.repository;

import com.team5.upc.dovitproject.Model.Donaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonacionRepository extends JpaRepository<Donaciones, Integer> {

}
