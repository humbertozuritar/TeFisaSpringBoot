package com.edu.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.edu.clinica.models.Sede;

@Repository
public interface SedeRepository extends JpaRepository<Sede, String> {

}
