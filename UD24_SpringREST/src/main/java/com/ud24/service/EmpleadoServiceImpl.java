package com.ud24.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ud24.dao.IEmpleadoDAO;
import com.ud24.dto.Empleado;

public class EmpleadoServiceImpl implements IEmpleadoService{
	
	@Autowired
	IEmpleadoDAO iEmpleadoDAO;
	

	@Override
	public List<Empleado> listarEmpleados() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado e) {
		
		return iEmpleadoDAO.save(e);
	}

	@Override
	public Empleado empleadoXID(Long id) {
		
		return iEmpleadoDAO.findById(id).get();
	}
	

	@Override
	public Empleado actualizarEmpleado(Empleado e) {
		
		return iEmpleadoDAO.save(e);
	}

	@Override
	public void eliminarEmpleado(Long id) {
		
		iEmpleadoDAO.deleteById(id);
		
	}

	//Implementación metodo creado interfaz service
	@Override
	public List<Empleado> listarEmpleadoTrabajo(String trabajo) {
		// TODO Auto-generated method stub
		return iEmpleadoDAO.findByTrabajo(trabajo);
	}
	

}
