package com.example.almacenes.services;
import java.util.List;

import com.example.almacenes.dto.Almacen;

public interface IAlmacenService {
	
	//Listar todos
	public List<Almacen> listarAlmacenes();
	
	//Listar por id
	public Almacen almacenXID(Integer id); 
	
	//Guardar
	public Almacen guardarAlmacen(Almacen Almacen);
	
	//Actualizar
	public Almacen actualizarAlmacen(Almacen Almacen);
	
	//Eliminar
	public void eliminarAlmacen(Integer id);

	
}
