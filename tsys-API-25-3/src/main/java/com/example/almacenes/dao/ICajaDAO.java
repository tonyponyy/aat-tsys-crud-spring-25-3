package com.example.almacenes.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.almacenes.dto.Caja;


public interface ICajaDAO extends JpaRepository<Caja,Integer> {



	
}
