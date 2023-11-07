package com.edu.clinica.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edu.clinica.models.Enfermedad;
import com.edu.clinica.repository.EnfermedadRepository;
import com.edu.clinica.service.IEnfermedadService;

@Service
public class EnfermedadServiceImpl implements IEnfermedadService{
	@Autowired
	private EnfermedadRepository enfermedadRepo;

	@Override
	public List<Enfermedad> ListarTodos() {
		return enfermedadRepo.findAll();
	}
}
