package com.edu.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.edu.clinica.models.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, String> {
	@Query(value = "SELECT CONCAT('P' , LPAD(IFNULL(MAX(SUBSTR(id_paciente,2,6)) , 0) + 1, 5 , '0' )) "
			+ " FROM TPaciente", nativeQuery = true)
	public String CodigoGenerado();
}
