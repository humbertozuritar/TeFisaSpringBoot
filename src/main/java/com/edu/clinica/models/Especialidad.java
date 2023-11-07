package com.edu.clinica.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TEspecialidad")
public class Especialidad implements Serializable {
	private static final long serialVersionUID = 1L;
	
    @Id
    @Column(name = "id_especialidad" ,columnDefinition="char(4)")
    private String idEspecialidad;
    
    @Column(name = "nombre" , length = 50)
    private String nombre;
    
    @Column(name = "area" , length = 50)
    private String area;

	public String getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(String idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
