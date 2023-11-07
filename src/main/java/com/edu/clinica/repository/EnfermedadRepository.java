package com.edu.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.clinica.models.Enfermedad;

@Repository
public interface EnfermedadRepository extends JpaRepository<Enfermedad, String> {

}
