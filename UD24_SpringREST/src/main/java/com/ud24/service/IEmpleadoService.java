package com.ud24.service;

import java.util.List;

import com.ud24.dto.Empleado;

public interface IEmpleadoService {
	
	//Metodos del CRUD
		public List<Empleado> listarEmpleados(); //Listar All 
		
		public Empleado guardarEmpleado(Empleado empleado);	//Guarda un empleado CREATE
		
		public Empleado empleadoXID(Long id); //Leer datos de un empleado READ
		
		public List<Empleado> listarEmpleadoTrabajo(String trabajo);//Listar empleado por campo trabajo
		
		public Empleado actualizarEmpleado(Empleado empleado); //Actualiza datos del empleado UPDATE
		
		public void eliminarEmpleado(Long id);// Elimina el empleado DELETE

}
