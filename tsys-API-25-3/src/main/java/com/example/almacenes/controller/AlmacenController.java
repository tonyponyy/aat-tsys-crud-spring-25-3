package com.example.almacenes.controller;

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

import com.example.almacenes.dto.Almacen;
import com.example.almacenes.services.AlmacenServiceImpl;

@RestController
@RequestMapping("/almacenes")
public class AlmacenController {

	@Autowired
	AlmacenServiceImpl AlmacenServideImpl;
	
	@GetMapping("/all")
	public List<Almacen> listarAlmacenes(){
		return AlmacenServideImpl.listarAlmacenes();
	}
	

	@PostMapping("/add")
	public Almacen salvarAlmacen(@RequestBody Almacen Almacen) {
		return AlmacenServideImpl.guardarAlmacen(Almacen);
	}
	
	
	@GetMapping("/{id}")
	public Almacen AlmacenXID(@PathVariable(name="id") Integer id) {
		
		Almacen Almacen_xid= new Almacen();
		
		Almacen_xid=AlmacenServideImpl.almacenXID(id);
		
		//System.out.println("Almacen XID: "+Almacen_xid);
		
		return Almacen_xid;
	}
	
	@PutMapping("/{id}")
	public Almacen actualizarAlmacen(@PathVariable(name="id")Integer id,@RequestBody Almacen Almacen) {
		
		Almacen Almacen_seleccionado= new Almacen();
		Almacen Almacen_actualizado= new Almacen();
		
		Almacen_seleccionado= AlmacenServideImpl.almacenXID(id);
		
		Almacen_seleccionado.setLugar(Almacen.getLugar());
		Almacen_seleccionado.setCapacidad(Almacen.getCapacidad());
		Almacen_seleccionado.setCajas(Almacen.getCajas());

		
		Almacen_actualizado = AlmacenServideImpl.actualizarAlmacen(Almacen_seleccionado);
		
		System.out.println("El Almacen actualizado es: "+ Almacen_actualizado);
		
		return Almacen_actualizado;
	}
	
	@DeleteMapping("/{id}")
	public void eliminarAlmacen(@PathVariable(name="id")Integer id) {
		AlmacenServideImpl.eliminarAlmacen(id);
		System.out.println("Almacen eliminado");
	}
	
	
}