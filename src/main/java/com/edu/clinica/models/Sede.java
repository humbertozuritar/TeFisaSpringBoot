package com.edu.clinica.models;


import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "TSede")
public class Sede implements Serializable {
	private static final long serialVersionUID = 1L;
	
    @Id
    @Column(name = "id_sede" ,columnDefinition="char(6)")
    private String idSede;
    
    @Column(name = "nombre" , length = 50)
    private String nombre;
    
    @Column(name = "c_Disponibles")
    private int cantDisponibles;
    
    @Column(name = "c_Ocupadas")
    private int cantOcupadas;

	public String getIdSede() {
		return idSede;
	}

	public void setIdSede(String idSede) {
		this.idSede = idSede;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantDisponibles() {
		return cantDisponibles;
	}

	public void setCantDisponibles(int cantDisponibles) {
		this.cantDisponibles = cantDisponibles;
	}

	public int getCantOcupadas() {
		return cantOcupadas;
	}

	public void setCantOcupadas(int cantOcupadas) {
		this.cantOcupadas = cantOcupadas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
