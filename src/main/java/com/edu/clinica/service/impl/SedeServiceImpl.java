package com.edu.clinica.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edu.clinica.models.Sede;
import com.edu.clinica.repository.SedeRepository;
import com.edu.clinica.service.ISedeService;

@Service
public class SedeServiceImpl implements ISedeService{
	@Autowired
	private SedeRepository sedeRepo;

	@Override
	public List<Sede> ListarTodos() {
		return sedeRepo.findAll();
	}
}
