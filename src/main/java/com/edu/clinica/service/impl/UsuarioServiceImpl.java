package com.edu.clinica.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edu.clinica.models.Usuario;
import com.edu.clinica.repository.UsuarioRepository;
import com.edu.clinica.service.IUsuarioService;

@Repository
public class UsuarioServiceImpl implements IUsuarioService{
	
	@Autowired
	private UsuarioRepository userRepo;
	
	@Override
	public List<Usuario> ListarTodos() {
		return userRepo.findAll();
	}

}
