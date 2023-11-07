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
@Table(name = "TPaciente")
public class Paciente implements Serializable {
	private static final long serialVersionUID = 1L;
	
    @Id
    @Column(name = "id_paciente" ,columnDefinition="char(6)")
    private String idPaciente;
    
    @Column(name = "dni" , columnDefinition="char(8)")
    private String dni;
    
    @Column(name = "nombre" , length = 50)
    private String nombre;
    
    @Column(name = "edad")
    private int edad;
    
    @Column(name = "altura")
    private int altura;
    
    @Column(name = "peso")
    private int peso;
    
    @Column(name = "presion_arterial" , length = 10)
    private String presionArterial;
    
    @Column(name = "sexo" , length = 50)
    private String sexo;

    @Column(name = "f_nacimiento"  , length = 15)
    private String fechaNac;
    
    @Column(name = "f_admision"  , length = 15)
    private String fechaAdmision;
    
    @Column(name = "direccion"  , length = 50)
    private String direccion;
    
    @ManyToOne
    @JoinColumn(name = "id_enfermedad")
    private Enfermedad enfermedad;
    
    @ManyToOne
    @JoinColumn(name = "id_medico")
    private Medico medico;
    
    @ManyToOne
    @JoinColumn(name = "id_sede")
    private Sede sede;

	public String getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getPresionArterial() {
		return presionArterial;
	}

	public void setPresionArterial(String presionArterial) {
		this.presionArterial = presionArterial;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getFechaAdmision() {
		return fechaAdmision;
	}

	public void setFechaAdmision(String fechaAdmision) {
		this.fechaAdmision = fechaAdmision;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Enfermedad getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
