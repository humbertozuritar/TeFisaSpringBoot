package com.edu.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.clinica.models.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, String> {

}
