package com.edu.clinica.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TEnfermedad")
public class Enfermedad implements Serializable {
	private static final long serialVersionUID = 1L;
	
    @Id
    @Column(name = "id_enfermedad" ,columnDefinition="char(6)")
    private String idEnfermedad;
    
    @Column(name = "nombre" , length = 50)
    private String nombre;
    
    @ManyToOne
    @JoinColumn(name = "id_especialidad")
    private Especialidad especialidad;

	public String getIdEnfermedad() {
		return idEnfermedad;
	}

	public void setIdEnfermedad(String idEnfermedad) {
		this.idEnfermedad = idEnfermedad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
