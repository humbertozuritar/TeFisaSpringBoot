package com.edu.clinica.service;

import java.util.List;

import com.edu.clinica.models.Paciente;

public interface IPacienteService {
	public List<Paciente> ListarTodos();
	public Paciente BuscarPorId(String id);
	public String CodigoGenerado();
	public Paciente Guardar(Paciente obj);
	public boolean Eliminar(String id);
}
