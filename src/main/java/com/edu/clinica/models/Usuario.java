package com.edu.clinica.models;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "TUsuario")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	
    @Id
    @Column(name = "id_usuario" ,columnDefinition="char(6)")
    private String idUsuario;
    
    @Column(name = "nombre" , length = 50)
    private String nombre;
    
    @Column(name = "contraseña " , length = 50)
    private String contrasennia;

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasennia() {
		return contrasennia;
	}

	public void setContrasennia(String contrasennia) {
		this.contrasennia = contrasennia;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}
