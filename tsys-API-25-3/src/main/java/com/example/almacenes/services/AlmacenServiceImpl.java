package com.example.almacenes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.almacenes.dao.IAlmacenDAO;
import com.example.almacenes.dto.Almacen;


@Service
public class AlmacenServiceImpl implements IAlmacenService {
	
	@Autowired
	IAlmacenDAO iAlmacenDAO;

	//Listar todos
		public List<Almacen> listarAlmacenes(){
			return iAlmacenDAO.findAll();
		};
		
		
		//Listar por id
		public Almacen almacenXID(Integer id) {
			return iAlmacenDAO.findById(id).get();
		}; 
		
		//Guardar
		public Almacen guardarAlmacen(Almacen Almacen) {
			return iAlmacenDAO.save(Almacen);
		};
		
		//Actualizar
		public Almacen actualizarAlmacen(Almacen Almacen) {
			return iAlmacenDAO.save(Almacen);
		};
		
		//Eliminar
		public void eliminarAlmacen(Integer id) {
			iAlmacenDAO.deleteById(id);
		}
		 


}
