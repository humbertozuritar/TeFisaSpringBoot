package com.edu.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.edu.clinica.models.Especialidad;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad, String> {

}
