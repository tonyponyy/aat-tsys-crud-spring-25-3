package com.example.almacenes.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Almacenes")
public class Almacen {

	// Atributos de la clase
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "lugar") // no es del todo necesario
	private String lugar;
	private int capacidad;
	@JoinColumn(name = "almacen") // tabla foranea
	@OneToMany()
	private List<Caja> cajas;

	// Constructores de clase
	public Almacen() {

	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLugar() {
		return lugar;
	}



	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


	public int getCapacidad() {
		return capacidad;
	}



	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}



	public List<Caja> getCajas() {
		return cajas;
	}


	public void setCajas(List<Caja> cajas) {
		this.cajas = cajas;
	}



	@Override
	public String toString() {
		return "Almacen [id=" + id + ", lugar=" + lugar + ", capacidad=" + capacidad + ", cajas=" + cajas + "]";
	}


	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caja")
	public List<Caja> getcajas() {
		return cajas;
	}

	public void setcajas(List<Caja> cajas) {
		this.cajas = cajas;
	}





}
