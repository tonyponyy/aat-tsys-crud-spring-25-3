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
import com.example.almacenes.dto.Caja;
import com.example.almacenes.services.CajaServiceImpl;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@RestController
@RequestMapping("/cajas")
public class CajaController {

	@Autowired
	CajaServiceImpl cajaServideImpl;
	
	@GetMapping("/all")
	public List<Caja> listarcajas(){
		return cajaServideImpl.listarcajas();
	}
	

	@PostMapping("/add")
	public Caja salvarcaja(@RequestBody Caja caja) {
		return cajaServideImpl.guardarcaja(caja);
	}
	
	
	@GetMapping("/{id}")
	public Caja cajaXID(@PathVariable(name="id") Integer id) {
		
		Caja caja_xid= new Caja();
		
		caja_xid=cajaServideImpl.cajaXID(id);
		
		//System.out.println("caja XID: "+caja_xid);
		
		return caja_xid;
	}
	
	@PutMapping("/{id}")
	public Caja actualizarcaja(@PathVariable(name="id")Integer id,@RequestBody Caja caja) {
		
		Caja caja_seleccionado= new Caja();
		Caja caja_actualizado= new Caja();
		
		caja_seleccionado= cajaServideImpl.cajaXID(id);
		
		caja_seleccionado.setContenido(caja.getContenido());
		caja_seleccionado.setValor(caja.getValor());
		caja_seleccionado.setAlmacen(caja.getAlmacen());
		
		caja_actualizado = cajaServideImpl.actualizarcaja(caja_seleccionado);
		
		System.out.println("El caja actualizado es: "+ caja_actualizado);
		
		return caja_actualizado;
	}
	
	@DeleteMapping("/{id}")
	public void eliminarcaja(@PathVariable(name="id")Integer id) {
		cajaServideImpl.eliminarcaja(id);
		System.out.println("caja eliminado");
	}
	
	
}