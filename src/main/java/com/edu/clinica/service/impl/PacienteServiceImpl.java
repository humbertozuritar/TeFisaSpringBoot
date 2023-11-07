package com.edu.clinica.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.clinica.models.Paciente;
import com.edu.clinica.repository.PacienteRepository;
import com.edu.clinica.service.IPacienteService;

@Service 
public class PacienteServiceImpl implements IPacienteService{
	@Autowired
	private PacienteRepository pacienteRepo;
	
	@Override
	public List<Paciente> ListarTodos() {
		return pacienteRepo.findAll();
	}

	@Override
	public Paciente BuscarPorId(String id) {
		return pacienteRepo.findById(id).orElse(null);
	}

	@Override
	public String CodigoGenerado() {
		return pacienteRepo.CodigoGenerado();
	}

	@Override
	public Paciente Guardar(Paciente obj) {
		return pacienteRepo.save(obj);
	}

	@Override
	public boolean Eliminar(String id) {
		Paciente obj = pacienteRepo.findById(id).orElse(null);
		
		if(obj != null) {
			 pacienteRepo.deleteById(id);
			 return true;
		}
		return false;
	}
}
