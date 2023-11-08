package com.example.almacenes.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.almacenes.dto.Almacen;


public interface IAlmacenDAO extends JpaRepository<Almacen,Integer> {



	
}
