package com.example.almacenes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.almacenes.dao.ICajaDAO;
import com.example.almacenes.dto.Caja;


@Service
public class CajaServiceImpl implements ICajaService {
	
	@Autowired
	ICajaDAO icajaDAO;

	//Listar todos
		public List<Caja> listarcajas(){
			return icajaDAO.findAll();
		};
		
		
		//Listar por id
		public Caja cajaXID(Integer id) {
			return icajaDAO.findById(id).get();
		}; 
		
		//Guardar
		public Caja guardarcaja(Caja caja) {
			return icajaDAO.save(caja);
		};
		
		//Actualizar
		public Caja actualizarcaja(Caja caja) {
			return icajaDAO.save(caja);
		};
		
		//Eliminar
		public void eliminarcaja(Integer id) {
			icajaDAO.deleteById(id);
		}
		 


}
