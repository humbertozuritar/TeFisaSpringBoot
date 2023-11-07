package com.edu.clinica.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edu.clinica.models.Medico;
import com.edu.clinica.repository.MedicoRepository;
import com.edu.clinica.service.IMedicoService;

@Service
public class MedicoServiceImpl implements IMedicoService{
	@Autowired
	private MedicoRepository medicoRepo;

	@Override
	public List<Medico> ListarTodos() {
		return medicoRepo.findAll();
	}
}
