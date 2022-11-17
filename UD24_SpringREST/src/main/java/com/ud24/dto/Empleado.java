package com.ud24.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {

	// Atributos de entidad empleado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "trabajo")
	private String trabajo;
	@Column(name = "sueldo")
	private int sueldo;
	
	//Constructor vacio
	public Empleado() {
		
	}

	//Constructor con parametros
	public Empleado(Long id, String nombre, String trabajo, int sueldo) {
		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.sueldo = asignarSueldo();
	}

	//Getters/Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + "]";
	}
	
	//Metodo para asignar sueldo segun el trabajo
	private int asignarSueldo() {

		String trabajo = this.getTrabajo();
		switch (trabajo) {
		case "Informatico":
			return 2000;
		case "Doctor":
			return 2100;
		case "Administrativo":
			return 1700;
		case "Profesor":
			return 1600;
		case "Repartidor":
			return 1000;
		case "Deportista":
			return 5000;
		default:
			return 900;
		}
	}
		
}
