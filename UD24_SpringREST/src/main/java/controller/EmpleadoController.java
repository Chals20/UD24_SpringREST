package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dto.Empleado;

import service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl e;
	
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados(){
		return e.listarEmpleados();
	}
	
	@GetMapping("/empleados/trabajo/{trabajo}")
	public List<Empleado> listarEmpleadoNombre(@PathVariable(name="trabajo") String trabajo){
		return e.listarEmpleadoTrabajo(trabajo);
	}
	
	@PostMapping("/empleados")
	public Empleado salvarEmpleado(@RequestBody Empleado empleado) {
		return e.guardarEmpleado(empleado);
	}
	
	@GetMapping("/empleados/{id}")
	public Empleado empleadoXID(@PathVariable(name="id") Long id) {
		
		Empleado empleado_xid= new Empleado();
		
		empleado_xid=e.empleadoXID(id);
		
		System.out.println("Empleado XID: "+empleado_xid);
		
		return empleado_xid;
	}
	
	@PutMapping("/empleados/{id}")
	public Empleado actualizarCliente(@PathVariable(name="id")Long id,@RequestBody Empleado empleado) {
		
		Empleado e_seleccionado= new Empleado();
		Empleado e_actualizado= new Empleado();
		
		e_seleccionado= e.empleadoXID(id);
		
		e_seleccionado.setNombre(empleado.getNombre());
		e_seleccionado.setTrabajo(empleado.getTrabajo());

		
		e_actualizado = e.actualizarEmpleado(e_seleccionado);
		
		System.out.println("El empleado actualizado es: "+ e_actualizado);
		
		return e_actualizado;
	}
	
	@DeleteMapping("/empleados/{id}")
	public void eliminarEmpleado(@PathVariable(name="id")Long id) {
		e.eliminarEmpleado(id);
	}
}
