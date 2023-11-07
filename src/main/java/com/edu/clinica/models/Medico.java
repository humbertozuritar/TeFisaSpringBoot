package com.edu.clinica.models;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "TMedico")
public class Medico implements Serializable {
	private static final long serialVersionUID = 1L;
	
    @Id
    @Column(name = "id_medico" , columnDefinition="char(6)")
    private String idMedico;
    
    @Column(name = "dni" , columnDefinition="char(8)")
    private String dni;
    
    @Column(name = "nombre" , length = 50)
    private String nombre;
    
    @Column(name = "direccion" , length = 50)
    private String direccion;
    
    @Column(name = "edad")
    private int edad;
    
    @Column(name = "sexo" , columnDefinition="char(1)")
    private String sexo;
    
    @ManyToOne
    @JoinColumn(name = "id_especialidad")
    private Especialidad especialidad;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

	public String getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(String idMedico) {
		this.idMedico = idMedico;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}
