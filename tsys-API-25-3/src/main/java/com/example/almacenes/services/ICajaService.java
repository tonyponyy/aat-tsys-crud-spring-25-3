package com.example.almacenes.services;
import java.util.List;

import com.example.almacenes.dto.Caja;

public interface ICajaService {
	
	//Listar todos
	public List<Caja> listarcajas();
	
	//Listar por id
	public Caja cajaXID(Integer id); 
	
	//Guardar
	public Caja guardarcaja(Caja caja);
	
	//Actualizar
	public Caja actualizarcaja(Caja caja);
	
	//Eliminar
	public void eliminarcaja(Integer id);

	
}
